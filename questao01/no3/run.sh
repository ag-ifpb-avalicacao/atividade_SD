#!/bin/bash
mvn clean package
sudo docker build -t udp/no3 .
sudo docker run -p 667:667 -d --name no3 udp/no3
