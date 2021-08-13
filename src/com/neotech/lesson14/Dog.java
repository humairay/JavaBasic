package com.neotech.lesson14;

public class Dog {

	// features
	String breed;
	String size;
	int age;
	String color;

	// behaviours
	// eat, run, sleep and name

	void eat() {
		System.out.println(breed + " is eating");
	}

	void run() {
		System.out.println(breed + " is running");
	}

	void sleep() {
		System.out.println(breed + " is sleeping");
	}

	void name() {
		System.out.println("Breed: " + breed);
	}

	
	
	
}
