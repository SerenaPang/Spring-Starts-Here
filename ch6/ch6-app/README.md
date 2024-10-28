#How to compile and run the main class
```
mvn package assembly:single  

java -cp target/ch6-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch6.app.App    

java -cp target/ch6-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch6.app.example1.App    

java -cp target/ch6-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch6.app.example2.App     

```

#What's aspect
An object that intercept method call and can execute logic before, after and instead 

#Why use aspect
Decouple code to easier maintain, misuse can lead to less maintainable

#How to define Aspect
Use @Aspect annotation and also add a bean of its type

#How to tell which and when to intercept?
Use @Around annotation, which is the most powerful, and @Before, @After, @AfterThrowing, @AfterReturning

#Define order for intercepting same method call
Use @Order when multiple aspects intercept the same method call







