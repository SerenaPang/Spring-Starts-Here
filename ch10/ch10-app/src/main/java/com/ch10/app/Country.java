package com.ch10.app;

public class Country {
	private String name;
	private int population;
	
	//define a static factory method that receives the name and the pupulation, this method return a Country instance with the provided value set
	public static Country of (String name, int pupulation) {
		Country country = new Country();
		country.setName(name);
		country.setPopulation(pupulation);
		return country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
