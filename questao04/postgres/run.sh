#!/bin/bash

docker build -t user/banco .
docker run -p 5433:5432 -d --name banco user/banco
