FROM openjdk:8-alpine

COPY target/uberjar/green-eye.jar /green-eye/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/green-eye/app.jar"]
