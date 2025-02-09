FROM openjdk-17
WORKDIR /app
COPY /target/docker.jar /app/docker.jar

