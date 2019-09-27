# Recopilación de métricas técnicas

Para la recopilación de métricas técnicas se ha utilizado la herramienta [cAdvisor](https://github.com/google/cadvisor) dockerizada.

La configuración de esta herramienta en Docker (ej∵ en docker-compose) es la siguiente:

```yaml
  cadvisor:
    restart: always
    image: google/cadvisor:latest
    container_name: edge.cadvisor
    volumes:
      - /:/rootfs:ro
      - /var/run:/var/run:rw
      - /sys:/sys:ro
      - /var/lib/docker:/var/lib/docker:ro
    depends_on:
      - database
    ports:
      - 8080:8080
    command: -storage_driver=influxdb -storage_driver_db=cadvisor -storage_driver_host=database:8086
    networks:
      edgenet:
        aliases:
          - cadvisor
```

Asimismo, es preciso crear la base de datos en InfluxDB para el almacenamiento de la información desde cAdvisor:

```shell
curl -XPOST 'http://localhost:8086/query' --data-urlencode 'q=CREATE DATABASE "cadvisor"'
```

