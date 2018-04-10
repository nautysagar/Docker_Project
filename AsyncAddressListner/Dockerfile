FROM openjdk:8
ADD target/AsyncAddress-0.0.1-SNAPSHOT.jar consumer-0.0.1-SNAPSHOT.jar
EXPOSE 7896
ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]