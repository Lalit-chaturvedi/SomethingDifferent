#define base docker image
FROM openjdk:11
LABEL maintainer="codeforce"
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar docker-HelloWorld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-HelloWorld-0.0.1-SNAPSHOT.jar"]