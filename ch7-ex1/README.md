#How to compile and run the main class

http://localhost:8080/

Move the home.html file to static folder under src/main/resources, a convention to follow

```
 mvn spring-boot:run
mvn package assembly:single  

java -cp target/ch7-ex1-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch7-ex1.app.Ch7Ex1Application    
 
 java -cp target/ch7-ex1-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch7-ex1.app.Ch7Ex1Application    
 
   
java -cp target/ch7-ex1-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch7-ex1.app.MainController

```







