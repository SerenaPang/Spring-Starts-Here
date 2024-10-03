package com.ch3.app.example32;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ch3.app.example32")
public class ProjectConfig {

//	@Bean
//	public Parrot parrot() {
//		Parrot p = new Parrot();
//		p.setName("Koko");
//		return p;
//	}
//	
//	@Bean 
//	public Person person(Parrot parrot) {//spring injects the parrot bean into this parameter
//		Person p = new Person();
//		p.setName("Ella");
//		//the relationship has been established
//		p.setParrot(parrot);
//		return p;
//	}
}