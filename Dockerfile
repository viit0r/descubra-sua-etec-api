# ---------- STAGE 1: DEPENDENCIES ----------
FROM maven:3.9.9-eclipse-temurin-17 AS deps

WORKDIR /app

COPY pom.xml .

RUN mvn -B -q -e -DskipTests dependency:go-offline


# ---------- STAGE 2: BUILD ----------
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY --from=deps /root/.m2 /root/.m2
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests


# ---------- STAGE 3: RUNTIME ----------
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar", "--server.port=${PORT}"]