FROM selenium/chrome-headless  # Or selenium/standalone-chrome

WORKDIR /app

COPY pom.xml ./
RUN mvn install

COPY src/main/java/ .:/app/src/main/java
COPY src/test/java/ .:/app/src/test/java

CMD ["mvn", "test"]
