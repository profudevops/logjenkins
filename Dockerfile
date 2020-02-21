FROM openjdk:8-jdk-alpine
MAINTAINER profuturo
VOLUME /tmp
EXPOSE 8080
ADD build/libs/logJenkinsPostgres-0.0.1-SNAPSHOT.jar springbootpostgresqldocker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootpostgresqldocker.jar"]