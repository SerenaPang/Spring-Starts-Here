package com.ch3.app.example36;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

	@Bean
	public Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	public Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("Miki");
		return p;
	}
	
	@Bean 
	public Person person(Parrot parrot2) {//miki
		Person p = new Person();
		p.setName("Ella");
		//setting the reference of the parrot bean to the person's parrot attribute
		p.setParrot(parrot2);
		return p;
	}
}