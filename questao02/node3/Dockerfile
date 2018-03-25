FROM maven:3.3.9-jdk-8
ADD . /opt
WORKDIR "/opt"
#CMD mvn exec:java -Dexec.mainClass="questao02.node3.Server_3"
CMD java -cp target/node3-1.0-SNAPSHOT.jar:./lib/* questao02.node3.Server_3
