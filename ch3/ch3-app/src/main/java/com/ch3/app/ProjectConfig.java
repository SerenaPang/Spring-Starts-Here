package com.ch3.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

	@Bean
	public Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	public Person person() {
		Person p = new Person();
		p.setName("Ella");
		//here we can link the person instance with parrot with direct method call
		
		return p;
	}
}