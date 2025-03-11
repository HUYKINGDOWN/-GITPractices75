# Sử dụng OpenJDK 11 làm môi trường chạy
FROM openjdk:11

# Copy file JAR từ thư mục target vào container
COPY target/UserApp-1.0-SNAPSHOT.jar app.jar

# Chạy ứng dụng khi container khởi động
ENTRYPOINT ["java", "-jar", "app.jar"]

