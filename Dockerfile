FROM maven:3.9.11-amazoncorretto-24 AS build
COPY --chown=maven:maven . /home/maven/src
WORKDIR /home/maven/src
RUN maven buildFatJar --no-daemon


FROM openjdk:24

RUN mkdir /app


EXPOSE 8080:8080


COPY --from=build /home/gradle/src/build/libs/*.jar   /app/ktor-mysql-backend.jar


ENTRYPOINT ["java","-jar","/app/ktor-mysql-backend.jar"]
