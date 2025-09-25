package com.ch2.app;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String name;

	//after the framework create the bean, we named it to kiki
	@PostConstruct
	public void init() {
		this.name = "Kiki";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parrot [name=" + name + "]";
	}
}
