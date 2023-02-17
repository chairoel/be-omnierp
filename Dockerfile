
FROM maven:3.8.3-openjdk-17 AS maven_build

COPY . /app-build
WORKDIR /app-build
RUN mvn clean package -DskipTests
WORKDIR /app-build

FROM openjdk:17-jdk-slim

WORKDIR /app-build
COPY omnierp-app/target/omnierp-app-0.0.1-SNAPSHOT.jar /app/be-omnierp.jar
WORKDIR /app

EXPOSE 8080
CMD ["java", "-jar", "be-omnierp.jar"]