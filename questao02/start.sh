#!/bin/bash

#first create this network
#docker network create --driver bridge isolated                                                                                                                                             [±master ●●]
#use this to view the network properties
#docker network inspect isolated 

cd client;
sh run.sh;
cd ..;
cd node1;
sh run.sh;
cd ..;
cd node2;
sh run.sh;
cd ..;
cd node3;
sh run.sh;
cd ..;
