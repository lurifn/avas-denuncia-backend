# use java 11
FROM adoptopenjdk/openjdk11:alpine-jre

#Info
LABEL maintainer="lluana13@hotmail.com"

# open port 8080
EXPOSE 8080

ARG JAR_FILE=target/avas-denuncia.jar
ARG DEPENDENCY=target/dependency

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]