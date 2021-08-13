package com.neotech.lesson15;

public class Phone {

	// attributes/variables
	String brand;
	String color;
	String model;
	int price;

	// behaviors/actions
	void call() {
		System.out.println(brand + " is calling");
	}

	void text() {
		System.out.println(brand + " is texting");
	}

	void navigate() {
		System.out.println(brand + " is navigating");
	}

}
