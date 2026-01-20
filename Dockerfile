# First stage: complete build environment
FROM maven:3.9.7-eclipse-temurin-21 AS builder

# add pom.xml and source code
COPY ./pom.xml pom.xml
COPY ./src src/

# add maven config
ENV MAVEN_CONFIG=/maven/.m2
RUN mkdir -p ${MAVEN_CONFIG}
COPY settings.xml ${MAVEN_CONFIG}/settings.xml

RUN mvn clean package -Dmaven.test.skip=true

FROM gcr.io/distroless/java21:nonroot
WORKDIR /app
COPY --from=builder target/*.jar /app/app.jar

CMD ["-jar", "/app/app.jar"]
EXPOSE 8080
