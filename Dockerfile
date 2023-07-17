# Use the official maven/Java 8 image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.9.3-eclipse-temurin-17-alpine as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml ./
COPY src ./src/

# Build a release artifact.
RUN mvn clean package -DskipTests

# Use AdoptOpenJDK for base image.
FROM eclipse-temurin:17-jdk-alpine

# Must declare /tmp as a volume to run embedded tomcat
VOLUME /tmp

# Default port used by the service
EXPOSE 8080

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/*.jar /home/back-resume.jar

# Run the web service on container startup.
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=8080","-jar","/home/back-resume.jar"]

# Health check on Spring actuator health endpoint
HEALTHCHECK CMD curl -s -f http://localhost:8080/actuator/health | grep UP
