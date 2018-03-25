FROM maven:3.3.9-jdk-8
ADD . /opt
WORKDIR "/opt"
#CMD mvn exec:java -Dexec.mainClass="questao02.node1.Server_1"
CMD java -cp target/node1-1.0-SNAPSHOT.jar:./lib/* questao02.node1.Server_1

