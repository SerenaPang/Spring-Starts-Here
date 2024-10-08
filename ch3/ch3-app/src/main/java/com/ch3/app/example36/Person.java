package com.ch3.app.example36;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name = "Ella";
	
	private Parrot parrot;
	
//	@Autowired
//	public Person(Parrot parrot) { //injecting value through constructor
//		this.parrot = parrot;
//	}
//	
	public Person() {
		// TODO Auto-generated constructor stub
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