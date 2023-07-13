FROM openjdk:17
EXPOSE 8890
ADD ./target/Origen-0.0.1-SNAPSHOT.jar   Origen.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/Origen.jar"]



