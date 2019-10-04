FROM prom/prometheus:latest

# Metadata
LABEL module.maintainer="onesaitplatform@indra.es" \
	  module.name="edge-prometheus"

COPY [ "./prometheus.yml", "/etc/prometheus/prometheus.yml" ]
COPY [ "./rules/*", "/etc/prometheus/rules/" ]
