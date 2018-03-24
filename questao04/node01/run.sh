#!/bin/bash

mvn clean package
docker build -t node01 .
docker run -i -t --name node01_app --link node02_app:data-server node01
