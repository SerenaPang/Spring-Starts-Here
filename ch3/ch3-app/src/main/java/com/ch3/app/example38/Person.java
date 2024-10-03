package com.ch3.app.example38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "Ella";
	
	private Parrot parrot;
	
	public Person(Parrot parrot2) {
		this.parrot = parrot2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parrot getParrot() {
		return parrot;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", parrot=" + parrot + "]";
	}

	public void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}
}