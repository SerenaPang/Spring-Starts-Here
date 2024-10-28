#To compile and run the main class

```
mvn package assembly:single  

java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.example1.App     

java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.App    

java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.example31.App   

java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.example32.App   

java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.example33.App   

```

#Why establish relationship among beans?
In order for one object use the methods and functions of the other object


#How to establish relationshhip with 2 beans
1.Call one method from another in the configuration class (Direct referring)
2.Define a parameter to the method annotated with @Bean
3.Use @Autowired annotation
- Annotated the the field in the class
- Annotated the constructor (parameters)
- Annotated the setter of the attribute

#Circular dependency
one bean depend on one another, avoid this!

#Several beans with same type
Tell Spring which one to inject by

- Use @Primary annotation
- Use @Qualifier annotation and naming the bean, inject them by the name
