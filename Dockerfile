FROM openjdk:8
EXPOSE 5000
ADD target/*.jar spring-jenkins-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-docker.jar"]