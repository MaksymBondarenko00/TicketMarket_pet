FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ./target/Delivery.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]