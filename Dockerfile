FROM openjdk:14-jdk AS builder

WORKDIR /app/

COPY . /app

RUN ./gradlew build

FROM openjdk:14-slim

COPY --from=builder /app/build/libs/openshift-java-spring-test*.jar openshift-java-spring-test.jar

ENV JAVA_OPTS=""

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "openshift-java-spring-test.jar"]
