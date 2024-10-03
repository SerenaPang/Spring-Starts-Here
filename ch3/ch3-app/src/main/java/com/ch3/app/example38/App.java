package com.ch3.app.example38;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * mvn package assembly:single
 * java -cp target/ch3-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.ch3.app.example38.App 
 * ProjectConfig.parrot2()
 * ProjectConfig.parrot1()
 * Person's name: Ella
 * Person's parrot: Parrot : Miki
 */
public class App {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			Person p = context.getBean(Person.class);

			System.out.println("Person's name: " + p.getName());
			System.out.println("Person's parrot: " + p.getParrot());
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
