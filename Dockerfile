FROM amazoncorretto:11-alpine

ARG FROM_JAR=build/libs/helloworld-sample-0.0.1-SNAPSHOT.jar

COPY ${FROM_JAR} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-XX:MaxRAM=256M", "-Xmx128M", "-Xss256k", "-gXms128M", "-jar","app.jar"]