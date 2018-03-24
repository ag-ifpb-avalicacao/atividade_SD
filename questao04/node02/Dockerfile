FROM openjdk:8-jdk-alpine
COPY target/classes/create_schema.sql create_schema.sql
COPY target/node02-1.0-SNAPSHOT-jar-with-dependencies.jar node02-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD java -jar node02-1.0-SNAPSHOT-jar-with-dependencies.jar
