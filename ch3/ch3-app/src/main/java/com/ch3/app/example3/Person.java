package com.ch3.app.example3;

public class Person {
	private String name;
	private Parrot parrot;

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

	public void setParrot(Parrot parrot2) {
		//this.parrot = parrot2;
	}
}