package com.ch3.app.example34;

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
	public Person person(Parrot parrot) {//inject parrot bean into this parameter
		Person p = new Person();
		p.setName("Ella");
		//setting the reference of the parrot bean to the person's parrot attribute
		p.setParrot(parrot);
		return p;
	}
}