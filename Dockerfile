FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demoJavaServer.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]