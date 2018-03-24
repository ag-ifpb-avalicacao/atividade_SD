#!/bin/bash

mvn clean package
docker build -t node02 .
docker run -p 8081:8080 -d --name node02_app --link banco:host-banco node02
