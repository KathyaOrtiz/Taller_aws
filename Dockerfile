FROM openjdk:8-jdk-alpine

COPY "./target/api_taller-1.0-SNAPSHOT.jar" "app.jar"

EXPOSE 8000

ENTRYPOINT ["java","-jar","app.jar"]