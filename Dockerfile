FROM openjdk:17
EXPOSE 8089
COPY target/*.jar  app.jar
ENTRYPOINT ["java","-jar","app.jar"]
