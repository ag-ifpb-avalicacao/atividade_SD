#!/bin/bash
mvn clean package
sudo docker build -t node1 .
sudo docker run --net=isolated -p 2001:1099 -d --name node1_app node1
