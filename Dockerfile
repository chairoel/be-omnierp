# menggunakan image openjdk:17-jdk-slim sebagai base image
FROM openjdk:17-jdk-slim

# menyalin file jar dan mengubah working directory ke dalam folder app
COPY omnierp-app/target/omnierp-app-0.0.1-SNAPSHOT.jar /app/be-omnierp.jar
WORKDIR /app

# expose port 8585
EXPOSE 8585

# menjalankan aplikasi
CMD ["java", "-jar", "be-omnierp.jar"]