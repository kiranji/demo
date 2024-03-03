
FROM ubuntu:latest
# Install Java and xvfb (X virtual framebuffer) for headless browsing
RUN apt-get update && apt-get install -y openjdk-11-jre

# Install Maven
RUN apt-get install -y maven

# Set working directory
WORKDIR /app

# Copy test code and dependencies
COPY . .

# Execute tests using the Maven wrapper
CMD ["mvn", "test"]
