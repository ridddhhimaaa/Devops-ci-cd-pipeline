FROM eclipse-temurin:21
COPY target/devops-project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
