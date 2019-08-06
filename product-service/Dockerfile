FROM openjdk:8-jdk-alpine
ADD target/product-service.jar product-service.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "product-service.jar"]

#biuld docker image
#docker build -f Dockerfile -t product-service .
#run image
#docker run -p 9002:9002 product-service