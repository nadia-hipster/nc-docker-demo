FROM openjdk:17-alpine
WORKDIR /app

#FROM evdnexus.frcl.bull.fr:8183/maven:3.8.4-openjdk-17-slim AS build
#WORKDIR /opt/midpoint

COPY build/libs/*.jar /app/gateway.jar
LABEL authors="a902526"

#EXPOSE 8888

ENTRYPOINT ["java", "-jar", "/app/gateway.jar"]