FROM openjdk:18-ea-11-jdk-alpine
ADD docker-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPS = ""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]