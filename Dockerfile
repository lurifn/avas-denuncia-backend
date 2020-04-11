# use java 11
FROM adoptopenjdk/maven-openjdk11

#Info
LABEL maintainer="lluana13@hotmail.com"

# open port 8080
EXPOSE 8080

ARG git_url=https://github.com/LuanaFn/avas-denuncia-backend.git
ARG branch=master

WORKDIR /opt/app

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git

RUN git clone ${git_url} && \
    cd avas-denuncia-backend && \
    git checkout ${branch} && \
    mvn clean install

ENTRYPOINT java -jar target/avas-denuncia.jar