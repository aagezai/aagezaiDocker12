# Use an OpenJDK runtime as a base image
FROM openjdk:18

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/aagezaidockerjar.jar /app/aagezaidockerjar.jar

# Expose the port the app runs on
EXPOSE 8080

# Define environment variables
ENV MYSQL_ROOT_PASSWORD=rootpass
ENV MYSQL_DATABASE=mydb
ENV MYSQL_USER=dbuser
ENV MYSQL_PASSWORD=dbpass

# Command to run the application with a specific profile
CMD ["java", "-jar", "/app/aagezaidockerjar.jar"]
