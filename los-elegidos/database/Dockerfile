FROM alpine

# Metadata
LABEL module.maintainer="onesaitplatform@indra.es" \
	  module.name="edge-database"

ENV FOREGO_FILE   forego-stable-linux-amd64.tgz 
ENV INFLUXDB_FILE influxdb-1.7.8_linux_amd64.tar.gz
ENV TELEGRAF_FILE telegraf-1.12.2_linux_amd64.tar.gz
ENV FOREGO_URL   https://bin.equinox.io/c/ekMN3bCZFUn/${FOREGO_FILE}
ENV INFLUXDB_URL https://dl.influxdata.com/influxdb/releases/${INFLUXDB_FILE}
ENV TELEGRAF_URL https://dl.influxdata.com/telegraf/releases/${TELEGRAF_FILE}

STOPSIGNAL SIGCONT

COPY [ "telegraf.conf", "/etc/telegraf/telegraf.conf" ]
COPY [ "influxdb.conf", "/etc/influxdb/influxdb.conf" ]
COPY [ "*.sh", "Procfile", "/" ]

RUN echo 'hosts: files dns' >> /etc/nsswitch.conf \
 && apk update && apk upgrade \
 && apk add --no-cache iputils ca-certificates net-snmp-tools procps lm_sensors bash curl \
 && update-ca-certificates \
 && chmod +x /telegraf.sh   \
 && chmod +x /influxdb.sh   \
 && chmod +x /createdb.sh   \
 && chmod +x /entrypoint.sh \
 && curl ${FOREGO_URL} > /tmp/${FOREGO_FILE} \
 && curl ${INFLUXDB_URL} > /tmp/${INFLUXDB_FILE} \ 
 && curl ${TELEGRAF_URL} > /tmp/${TELEGRAF_FILE} \
 && tar xzf /tmp/${FOREGO_FILE}   -C /bin \
 && tar xzf /tmp/${INFLUXDB_FILE} -C /tmp \
 && tar xzf /tmp/${TELEGRAF_FILE} -C /tmp \
 && cp /tmp/influxdb-1.7.8-1/usr/bin/influxd /usr/bin/ \
 && cp /tmp/telegraf/usr/bin/telegraf /usr/bin/ \
 && rm -rf /tmp/*.tar.gz /tmp/*.tgz /tmp/influxdb-1.7.8-1 /tmp/telegraf

EXPOSE 8086/tcp 8888/tcp 5300/tcp

ENTRYPOINT ["/entrypoint.sh"]
CMD ["forego", "start", "-r"]
