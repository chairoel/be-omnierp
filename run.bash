#! /bin/bash
docker build -t be-omnierp . &&
docker run -it -d --name be-omnierp --restart always -p 8585:8080 be-omnierp