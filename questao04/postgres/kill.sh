#!/bin/bash

docker stop banco
docker rm banco
docker rmi user/banco
