#!/bin/bash
mvn clean package
sudo docker build -t node2 .
sudo docker run --net=isolated -p 2002:1099 -d --name node2_app node2
