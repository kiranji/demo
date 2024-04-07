# Base image
FROM maven:3.8.5-openjdk-11-slim

# Copy code from local to image
COPY ./ /app
# Specify working directory
WORKDIR /app
# Execute command at creation of image
RUN mvn clean compile
CMD mvn test
