#!/bin/bash
mvn clean package
sudo docker build -t client .
sudo docker run --net=isolated -p 2000:1099 -d --name client_app client
