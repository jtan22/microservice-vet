FROM amazoncorretto:17
ADD target/microservice-vet-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]