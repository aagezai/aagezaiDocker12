# Use an OpenJDK runtime as a base image
FROM openjdk:18

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY ./target/aagezaidockera12-0.0.1-SNAPSHOT.jar /app

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application with a specific profile
CMD ["java", "-Dspring.profiles.active=docker", "-jar", "aagezaidockera12-0.0.1-SNAPSHOT.jar"]
