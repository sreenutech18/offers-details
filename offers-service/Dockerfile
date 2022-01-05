# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port  available to the world outside this container
EXPOSE 2023

COPY target/offers-service-1.0-SNAPSHOT.jar  offers-service-1.0-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-jar","offers-service-1.0-SNAPSHOT.jar"]
