#!/bin/bash

cd node01 && sh kill.sh && cd ..
cd node02 && sh kill.sh && cd ..
cd postgres && sh kill.sh && cd ..
