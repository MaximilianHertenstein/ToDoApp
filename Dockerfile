# ---- Build stage ----
FROM maven:3.9.15-eclipse-temurin-25 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# ---- Runtime stage ----
FROM eclipse-temurin:25-jdk

WORKDIR /app
COPY --from=build /app/target/ToDoApp-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
EXPOSE 8080

CMD ["java", "-jar", "app.jar"]