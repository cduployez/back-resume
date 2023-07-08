FROM eclipse-temurin:17-jdk-alpine

# Must declare /tmp as a volume to run embedded tomcat
VOLUME /tmp

# Default port used by the service
EXPOSE 8080

# Copy the compiled archive to the container home directory
COPY target/*.jar /home/back-resume.jar

# Start application
ENTRYPOINT ["java","-jar","/home/back-resume.jar"]

# Health check on Spring actuator health endpoint
HEALTHCHECK CMD curl -s -f http://localhost:8080/actuator/health | grep UP