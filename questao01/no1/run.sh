#!/bin/bash
mvn clean package
sudo docker build -t udp/no1 .
sudo docker run -i -t --name no1 --link no2:no2 udp/no1
