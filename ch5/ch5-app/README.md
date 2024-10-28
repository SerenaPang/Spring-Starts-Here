
#How to compile and run the main class
```
mvn package assembly:single  

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.App    

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example2.App     

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example3.App 

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example4.App 

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example5.App 

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example6.App 

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example7.App 

java -cp target/ch5-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch5.app.example8.App 
```

#Bean Scope

Defines how Spring manages the object instance

1. Singleton 

Unique name, inmmutable, eager instantiation, default, create and use only one specific instance by its name

2. Prototype

By Bean type, mutable, might get different instance when used, create new instance each time call its name