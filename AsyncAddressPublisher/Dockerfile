FROM openjdk:8
ADD target/AsyncAddress-0.0.1-SNAPSHOT.jar producer-0.0.1-SNAPSHOT.jar
EXPOSE 7895
ENTRYPOINT ["java","-jar","producer-0.0.1-SNAPSHOT.jar"]