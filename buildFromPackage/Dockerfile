#Download an image in which java version 8 is installed
FROM java:8
# Setting the work directory as “/”
WORKDIR /
#Copying “package.jar” to the working directory mentioned above
ADD package.jar package.jar
# Setting the application network port as 8080
EXPOSE 8080
# Executing the program using package.jar
CMD java -jar package.jar

