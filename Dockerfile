FROM openjdk:8-jdk-alpine
MAINTAINER dlarico@minsa.gob.pe
ADD mcs-servicio-renhice-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
