package com.ch3.app.example37;

import org.springframework.beans.factory.annotation.Qualifier;
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
		p.setName("miki");
		return p;
	}
	
	@Bean 
	public Person person(@Qualifier("parrot2") Parrot parrot) {
		Person p = new Person();
		p.setName("Ella");
		p.setParrot(parrot);
		return p;
	}
}