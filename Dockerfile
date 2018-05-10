FROM java:openjdk-8-jre

COPY ./target/c-http-kit-0.1.0-standalone.jar c-http-kit-0.1.0-standalone.jar

ENV PORT 80

EXPOSE 80

CMD ["java", "-jar", "c-http-kit-0.1.0-standalone.jar"]