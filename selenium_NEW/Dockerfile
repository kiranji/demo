FROM selenium/chrome-headless

WORKDIR /app

COPY pom.xml ./
RUN mvn install

COPY src/main/java/ .:/app/src/main/java
COPY src/test/java/ .:/app/src/test/java

CMD ["mvn", "test"]
