#How to compile and run the main class

http://localhost:8080/

http://localhost:8080/home?color=blue

http://localhost:8080/home?color=blue&username=Jane

Move the home.html file to templates folder under src/main/templates

http://localhost:8080/home?color=pink&username=Gatita

check all process:
ps -fea | grep java

kill the process:
kill -9 22317


mvn clean
mvn package
mvn spring-boot:run
mvn package assembly:single  






