package com.neotech.lesson20;

public class Car {
	String model, brand;
	int year;

	Car() {
		System.out.println("I am the default constructor!!");
	}
	
	Car(String carModel, String carBrand, int carYear) {
		System.out.println("I am creating an object with parameters");
		year = carYear;
		model = carModel;
		brand = carBrand;
	}

	// this method will print the details of the car
	public void printDetails() {
		System.out.println("I have a " + year + " " + model + " of " + brand);
	}
}
