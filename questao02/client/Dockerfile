FROM maven:3.3.9-jdk-8
ADD . /opt
WORKDIR "/opt"
#CMD mvn exec:java -Dexec.mainClass="questao02.client.Client"
CMD java -cp target/client-1.0-SNAPSHOT.jar:./lib/* questao02.client.Client

