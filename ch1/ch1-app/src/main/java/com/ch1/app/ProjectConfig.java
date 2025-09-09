package com.ch1.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//use the configuration annotation to define this class as a spring configuration class
@Configuration

public class ProjectConfig {
	//by adding the bean annotation, spring call this method when context initialized, and add return value to the context
	@Bean
	Parrot parrot() {
		var p = new Parrot();
		//set the name for the parrot, so we know which parrot when testing the application
		p.setName("Koko");
		//spring adds to its context the Parrot instance returned by the method
		return p;
	}
	
	//adds the spring the spring context 
	@Bean
	String hello() {
		return "Hello";
	}
	
	//adds the integer to spring context
	@Bean
	Integer ten() {
		return 10;
	}
	
	//adding more beans with the same type
	@Bean 
	//the primary annotation set s this bean as default when not specifying by name and call the class Parrot
	//@Primary
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("Miki");
		return p;
	}
	
	//need to set different names so when calling by context we can differentiate them
	//if you want to give another name to the bean other than the method name
	//@Bean(name = "riki")
	//@Bean(value = "riki")
	//@Bean("riki")
	@Bean 
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Riki");
		return p;
	}

}
