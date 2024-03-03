FROM ubuntu:latest
# Install Java and xvfb (X virtual framebuffer) for headless browsing
RUN apt-get update && apt-get install -y openjdk-17-jre-headless xvfb

# Install Maven
RUN apt-get install -y maven

# Set working directory
WORKDIR /app

# Copy test code and dependencies
COPY . .

# Install dependencies (e.g., Maven) (optional)
# RUN mvn install -DskipTests # Keep this if you want separate build step in Jenkins

# Start xvfb for headless execution
RUN /usr/bin/Xvfb :99 -screen 0 1024x768x24 &

# Headless browser configuration (Firefox)
ENV MOZ_HEADLESS=true

# Execute tests using the Maven wrapper
CMD ["mvn", "test"]
