package com.ch3.app.example31;

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
		//the relationship has been established
		//p.setParrot(parrot());
		return p;
	}
}