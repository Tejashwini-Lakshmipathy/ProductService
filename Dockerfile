FROM ubuntu:latest
EXPOSE 8080
LABEL authors="APPLE"
Add target/product-service-0.0.1-SNAPSHOT.jar product-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/product-service-0.0.1-SNAPSHOT.jar"]