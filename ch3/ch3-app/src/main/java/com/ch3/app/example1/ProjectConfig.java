package com.ch3.app.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

	@Bean
	public Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	
	@Bean
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Miki");
		return p;
	}

//	@Bean
//	public Person person(@Qualifier("parrot2") Parrot parrot){
//			Person p = new Person();
//			p.setName("Ella");
//			p.setParrot(parrot);
//			return p;
//		}
//	}
	
//	//injecting bean by parameter
//	@Bean
//	public Person person(Parrot parrot) {
//		Person p = new Person();
//		p.setName("Ella");
//		//establish relationship btw person and parrot
//		p.setParrot(parrot);
//		return p;
//	}


//	@Bean
//	String hello() {
//		return "Hello";
//	}
//
//	@Bean
//	Integer ten() {
//		return Integer.valueOf(10);
//	}
}