#!/bin/bash
mvn clean package
sudo docker build -t node3 .
sudo docker run  --net=isolated -p 2003:1099 -d --name node3_app node3
