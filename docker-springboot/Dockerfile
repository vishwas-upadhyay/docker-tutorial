#This is the base docker image on that our application will run
FROM openjdk:8
#Always set this property so the world will know who is the owner of this image
MAINTAINER Vishwas Upadhyay <vishwas.it@gmail.com>
# Adding executable jar file to image root so that it can be invoked when we spin container
ADD target/docker-springboot.jar docker-springboot.jar
# Expose the port on which your image will run within docker environment
# spring boot application runs on embeded tomcat on default port 8080.
# so if we want to expose port here then we also need to overwrite port for tomcat in application.properties
# file via setting server.port=XXXX
EXPOSE 8081
# This is main command which needs to be run when you start container
ENTRYPOINT ["java","-jar","docker-springboot.jar"]


