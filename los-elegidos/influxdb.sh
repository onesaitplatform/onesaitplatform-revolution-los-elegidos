#!/bin/sh

#curl -XPOST 'http://localhost:8086/query' --data-urlencode 'q=CREATE DATABASE "cadvisor"'
curl -XPOST 'http://localhost:8086/query' --data-urlencode 'q=CREATE DATABASE "prometheus"'
