FROM openjdk:8-jdk-alpine
ADD target/api-gateway.jar api-gateway.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]


#biuld docker image
#docker build -f Dockerfile -t api-gateway .
#run image
#docker run -p 9001:9001 api-gateway