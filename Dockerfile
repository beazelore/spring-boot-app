FROM openjdk:8
ADD target/spring-boot-demo2-0.0.1-SNAPSHOT.jar spring-boot-demo2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-demo2-0.0.1-SNAPSHOT.jar"]