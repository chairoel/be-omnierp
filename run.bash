#! /bin/bash
mvn install clean package &&
docker build -t --no-cache be-omnierp .&&
docker run -it -d --name be-omnierp --restart always -p 8585:8080 be-omnierp