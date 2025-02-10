FROM openjdk:17-jdk-alpine
#create /app directory in container
WORKDIR /app
#copy jar file in /app dir
COPY /target/docker.jar /app/docker.jar
RUN echo "Hii"
#
CMD ["java","-jar","docker.jar"]
