FROM openjdk:8
EXPOSE 9000
ARG JAR_FILE=target/spring-docker-demo.jar
ADD ${JAR_FILE} spring-docker-demo.jar
ENTRYPOINT ["java","-jar","/spring-docker-demo.jar"]