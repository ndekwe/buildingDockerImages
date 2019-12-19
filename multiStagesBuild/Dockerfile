
FROM maven as heavybuilder
RUN git clone https://github.com/ndekwe/buildingDockerImages.git
RUN cd buildingDockerImages/multiStagesBuild && mvn package

FROM openjdk:8-alpine as mediumbuilder ( or as smallbuilder)
RUN mkdir /workingdir
COPY --from=heavybuilder /target/container-maven-0.1.0.jar /workingdir/container-maven-0.1.0.jar
EXPOSE 8080
#ENTRYPOINT ["java", "-jar"]
#CMD ["/path-to-jar-file"]
# Executing the program using package.jar and directing the result in another file
RUN java -jar container-maven-0.1.0.jar >> message.txt


#Hano dushobora gushyiraho indi container which just displays the content of 
#the executed program from mediumbuilder. So that container should be called lightbuilder
#Downloading another image and renaming it

FROM alpine:latest AS lightproduction
#Copying files from heavybuilder to production
COPY --from=mediumbuilder /workingdir/container-maven-0.1.0.jar .
# Appending new content to a file
RUN echo "...and pumping its message into a light production image :)" >> message.txt
#Dislaying file content
CMD cat message.txt
