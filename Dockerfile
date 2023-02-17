
# menggunakan image maven:3.8.3-openjdk-17 sebagai base image untuk melakukan build jar
FROM maven:3.8.3-openjdk-17 AS maven_build

# menyalin seluruh source code dan pom.xml ke dalam container
COPY . /app-build

WORKDIR /app-build

# melakukan build jar dengan Maven
RUN mvn clean package -DskipTests

# menggunakan image openjdk:17-jdk-slim sebagai base image untuk menjalankan aplikasi Spring Boot
FROM openjdk:17-jdk-slim

WORKDIR /app-build

# menyalin file jar dan mengubah working directory ke dalam folder app
COPY omnierp-app/target/omnierp-app-0.0.1-SNAPSHOT.jar /app/be-omnierp.jar
WORKDIR /app

# expose port 8585
EXPOSE 8080

# menjalankan aplikasi
CMD ["java", "-jar", "be-omnierp.jar"]