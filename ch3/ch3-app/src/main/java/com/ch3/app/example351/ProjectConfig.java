package com.ch3.app.example351;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
	public Person person(Parrot parrot) {//inject parrot bean through constructor
		Person p = new Person(parrot);
		p.setName("Ella");
		return p;
	}
}