package com.ch3.app.example38;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ch3.app.example38")
public class ProjectConfig {

	@Bean
	public Parrot parrot1() {
		System.out.println("ProjectConfig.parrot1()");
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	public Parrot parrot2() {
		System.out.println("ProjectConfig.parrot2()");
		Parrot p = new Parrot();
		p.setName("Miki");
		return p;
	}
}