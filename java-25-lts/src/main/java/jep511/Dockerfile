FROM maven:3.9-eclipse-temurin-25 AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline -q
COPY src ./src
RUN mvn clean package -DskipTests -q

FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=builder /build/target/java25ltsjar.jar app.jar
ENTRYPOINT ["java", "-cp", "app.jar"]
CMD ["jep511.MainJep511"]
