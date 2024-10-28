```
mvn package assembly:single
java -cp target/ch2-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch2.app.App

```

#Object instance - Bean
Spring add Object instance to the Spring context, so it can manage it. Spring can only see the instance we add to its context, which is bean.

#How to add beans to spring context

1. Use @Bean annotation
 Add instance to the Spring context as a bean
 More code

2. Use @Component annotation (stereotype annotation)
Less code, easier to read

3. Use registerBean() 


