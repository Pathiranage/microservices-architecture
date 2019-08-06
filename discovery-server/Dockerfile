FROM openjdk:8-jdk-alpine
ADD target/discovery-server.jar discovery-server.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "discovery-server.jar"]


#biuld docker image
#docker build -f Dockerfile -t discovery-server .
#run image
#docker run -p 9000:9000 discovery-server