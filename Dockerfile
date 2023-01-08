FROM openjdk:11
EXPOSE 8080
ADD target/doc-jen.jar doc-jen.jar
ENTRYPOINT ["java", "-jar", "/doc-jen.jar"]