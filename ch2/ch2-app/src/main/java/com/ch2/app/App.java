 package com.ch2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.common.base.Supplier;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person p = context.getBean(Person.class);
		System.out.println("Person's name: " + p.getName());
		System.out.println("Parrot's name: " + p.getParrot());
	}
	
	/**
	 * case 1(normal class): when the person is not initialized in main, it will use the name initialized in person class, the parrot name is null even though it's initialized in the costructor
	 * 
	 * case 2(injected bean): when the person is initialized with bean and in config file the bean has been injected by params, it will use the name from the bean injected from the config file, and it's parrot is passed from the class initialized.
	 *  if the parot is not initialized, it will find the bean in config file
	 *  
	 *  case3 (injected by bean but initialized value in constuctor): both class use the constructor value
	 *  
	 *  summary: 
	 *  If the value is declared in bean, it will  use the value in bean,and the object value passed in original class(even tho there is bean injected in config), but if the 
	 * 
	 * */
	
//	public static void main(String[] args) {
//		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//		
//		//Person p = new Person();
//		Person p = context.getBean(Person.class);
//		System.out.println("Person's name: " + p.getName());
//		System.out.println("Person's Parrot's name: " + p.getParrot());
//	}
	
	
	//Scope example
	
//	 public static void main(String[] args) {
//	      ApplicationContext context = new ClassPathXmlApplicationContext("/Users/serenapang/Development/Spring/ch2/ch2-app/src/main/java/com/ch2/app/Beans.xml");
//	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
//
//	      objA.setMessage("I'm object A");
//	      objA.getMessage();
//
//	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//	      objB.getMessage();
//	   }
	
	
}
