FROM openjdk:8
EXPOSE 9000
ARG JAR_FILE=target/spring-demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]