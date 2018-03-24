#!/bin/bash

cd postgres && sh run.sh && cd ..
cd node02 && sh run.sh && cd ..
cd node01 && sh run.sh && cd ..
