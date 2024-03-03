FROM ubuntu:latest

# Install Java and xvfb (X virtual framebuffer) for headless browsing
RUN apt-get update && apt-get install -y openjdk-17-jre-headless xvfb

# Set working directory
WORKDIR /app

# Copy test code and dependencies
COPY . .

# Install dependencies (e.g., Maven)
RUN mvn install -DskipTests # Replace with your build command if different

# Start xvfb for headless execution
RUN /usr/bin/Xvfb :99 -screen 0 1024x768x24 &

# Headless browser configuration (Firefox)
ENV MOZ_HEADLESS=true

# Execute tests
CMD ["mvn", "test"] # Replace with your test execution command
