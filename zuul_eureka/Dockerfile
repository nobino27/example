FROM java:8 as build

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew build

FROM openjdk:8-jre-alpine

WORKDIR /opt/

COPY --from=build /app/build/libs/api-database-0.1.0.jar /opt/api-db.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/api-db.jar"]