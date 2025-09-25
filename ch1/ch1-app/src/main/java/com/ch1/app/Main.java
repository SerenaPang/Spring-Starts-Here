package com.ch1.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 * 
 * To compile and run the class 
 * java -cp target/ch1-app-1.0-SNAPSHOT.jar src/main/java/com/ch1/app/Main.java
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	//create instance of spring context
//    	var context = new AnnotationConfigApplicationContext();
//    	Parrot p = new Parrot();
      
    	//send the configuration class as a parameter to tell spring to use it when initializing the context
    	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	//gets a reference of a bean of type Parrot from the spring context
    	//only when there is just one bean of this type
    	//Parrot p = context.getBean(Parrot.class);
    	
    	//if you have more beans with the same type
    	Parrot p = context.getBean("parrot", Parrot.class);
    	Parrot p1 = context.getBean("parrot1", Parrot.class);
    	System.out.println(p.getName() + " - age: " + p.getAge());
    	System.out.println(p1.getName());
    	
    	String s = context.getBean(String.class);
    	System.out.println(s);
    	
    	Integer n = context.getBean(Integer.class);
    	 System.out.println(n);
    }
}
