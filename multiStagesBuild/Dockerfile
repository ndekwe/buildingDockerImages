#Download an image in which java version 8 is installed
FROM java:8 AS heavybuilder
#Creating a new directory
RUN mkdir /workingdir
#Copying “package.jar” to the working directory
ADD package.jar /workingdir/package.jar
#Setting the new directory as a working directory
WORKDIR /workingdir
# Setting the application network port as 8080
EXPOSE 8080
# Executing the program using package.jar and directing the result in another file
RUN java -jar package.jar >> message.txt


#Downloading another image and renaming it
FROM alpine:latest AS production
#Copying files from heavybuilder to production
COPY --from=heavybuilder /workingdir/ .
# Appending new content to a file
RUN echo "...and pumping its message into a light production image :)" >> message.txt
#Dislaying file content
CMD cat message.txt
