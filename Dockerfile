FROM openjdk:9.0.4-12-jdk-slim

COPY target/*.jar /app/application.jar

EXPOSE 9090
CMD ["java", "-jar", "/app/application.jar"]