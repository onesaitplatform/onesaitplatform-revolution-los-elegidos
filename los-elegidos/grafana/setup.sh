#!/bin/bash

# Taken from https://github.com/grafana/grafana-docker/issues/74

# Script to configure grafana datasources and dashboards.
# Intended to be run before grafana entrypoint...
# Image: grafana/grafana:4.1.2
# ENTRYPOINT [\"/run.sh\"]"

GRAFANA_URL=${GRAFANA_URL:-http://$GF_SECURITY_ADMIN_USER:$GF_SECURITY_ADMIN_PASSWORD@localhost:3000}
DATASOURCES_PATH=${DATASOURCES_PATH:-/etc/grafana/datasources}
DASHBOARDS_PATH=${DASHBOARDS_PATH:-/etc/grafana/dashboards}
PREFERENCES_PATH=${DASHBOARDS_PATH:-/etc/grafana/preferences.json}

# Generic function to call the Vault API
grafana_api() {
  local verb=$1
  local url=$2
  local params=$3
  local bodyfile=$4
  local response
  local cmd

  cmd="curl -L -s --fail -H \"Accept: application/json\" -H \"Content-Type: application/json\" -X ${verb} -k ${GRAFANA_URL}${url}"
  [[ -n "${params}" ]] && cmd="${cmd} -d \"${params}\""
  [[ -n "${bodyfile}" ]] && cmd="${cmd} --data @${bodyfile}"
  echo "Running ${cmd}"
  eval ${cmd} || return 1
  return 0
}

wait_for_api() {
  while ! grafana_api GET /api/user/preferences
  do
    sleep 5
  done 
}

install_datasources() {
  local datasource

  for datasource in ${DATASOURCES_PATH}/*.json
  do
    if [[ -f "${datasource}" ]]; then
      echo "Installing datasource ${datasource}"
      if grafana_api POST /api/datasources "" "${datasource}"; then
        echo "installed ok"
      else
        echo "install failed"
      fi
    fi
  done
}

install_dashboards() {
  local dashboard

  for dashboard in ${DASHBOARDS_PATH}/*.json
  do
    if [[ -f "${dashboard}" ]]; then
      echo "Installing dashboard ${dashboard}"

      if grafana_api POST /api/dashboards/db "" "${dashboard}"; then
        echo "installed ok"
      else
        echo "install failed"
      fi

    fi
  done
}

theme_light() {
  if grafana_api PUT /api/org/preferences "" "${PREFERENCES_PATH}"; then
    echo "org preferences ok"
  else
    echo "org preferences failed"
  fi
}

configure_grafana() {
  wait_for_api
  install_datasources
  install_dashboards
  theme_light
}

echo "Running configure_grafana in the background..."
configure_grafana &
/run.sh
exit 0