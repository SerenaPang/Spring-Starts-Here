package com.ch3.app.example38;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.common.base.Supplier;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person p = context.getBean(Person.class);
		
		System.out.println("Person's name: " + p.getName());
		System.out.println("Person's parrot: " + p.getParrot());
	}
}
