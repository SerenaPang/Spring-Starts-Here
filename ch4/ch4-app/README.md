
#How to compile and run the main class

```
mvn package assembly:single  

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.App    

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.example2.App     

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.example3.App  

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.example4.App 

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.example5.App  

java -cp target/ch4-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch4.app.example6.App  
```

Use @Service and @Repository annotation instead of @Component to make the component responsibility explicit and easy to read and understand 