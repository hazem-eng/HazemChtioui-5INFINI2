FROM openjdk:17
EXPOSE 8089
COPY target/eventsProject-1.0.0-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","app.jar"]
