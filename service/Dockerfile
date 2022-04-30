FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine
ARG JAR_FILE=target/service*.jar
COPY ${JAR_FILE} service.jar
EXPOSE 8080:8080
ENTRYPOINT ["java", "-Djavax.xml.accessExternalSchema=file", "-Djavax.xml.accessExternalDTD=file","-jar","/service.jar"]