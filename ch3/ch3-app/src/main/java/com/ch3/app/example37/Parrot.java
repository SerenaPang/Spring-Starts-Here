package com.ch3.app.example37;

public class Parrot {
	private String name = "Koko";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parrot : " + name;
	}
}