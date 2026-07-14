FROM ubuntu:latest
EXPOSE 8080
LABEL authors="APPLE"
ADD target/product-service.jar product-service.jar
ENTRYPOINT ["java","-jar", "/product-service.jar"]