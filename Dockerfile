FROM openjdk:11

ADD target/compte-service-0.0.1-SNAPSHOT.jar compte-service.jar

ENTRYPOINT ["java","-jar","compte-service.jar"]