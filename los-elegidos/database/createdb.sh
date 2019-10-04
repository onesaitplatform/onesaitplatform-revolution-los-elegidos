#!/bin/bash
sleep 30
curl -XPOST 'http://127.0.0.1:8086/query' --data-urlencode 'q=CREATE DATABASE "prometheus"'