#!/bin/bash

#1. The URL
#2. The City (string)

wget "$1&pagesize=10000" -O unfilteredWebsite.txt

java -jar WalkingList.jar unfilteredWebsite.txt output.csv $2 

