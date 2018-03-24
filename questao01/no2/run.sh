#!/bin/bash
mvn clean package
sudo docker build -t udp/no2 .
sudo docker run -p 666:666 -d --name no2 --link no3:no3 udp/no2
