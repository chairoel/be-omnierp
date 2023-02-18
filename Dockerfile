FROM openjdk:17-jdk-slim

COPY omnierp-app/target/omnierp-app-0.0.1-SNAPSHOT.jar /app/be-omnierp.jar
WORKDIR /app

EXPOSE 8080
CMD ["java", "-jar", "be-omnierp.jar", "-DDB_HOST=172.17.0.4"]
