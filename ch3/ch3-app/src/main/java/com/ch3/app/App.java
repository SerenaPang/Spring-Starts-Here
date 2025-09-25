package com.ch3.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.common.base.Supplier;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person person = context.getBean(Person.class);
		Parrot parrot = context.getBean(Parrot.class);
		//if you only has the instance and the class, you did not create a link btw person and parrot
		//in order to make a link btw the instance, you can call the set method to set the parrot for the person 
		
		System.out.println("Person's name: " + person.getName());
		
		System.out.println("Parrot's name: " + parrot.getName());
		
		System.out.println("Person's parrot: " + person.getParrot());
	}
}
