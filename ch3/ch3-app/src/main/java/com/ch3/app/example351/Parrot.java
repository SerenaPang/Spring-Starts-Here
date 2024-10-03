package com.ch3.app.example351;

import org.springframework.stereotype.Component;

@Component
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