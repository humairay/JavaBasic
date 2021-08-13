package com.neotech.lesson27;

public class Car {
		/*
		 * Create an arraylist of cars and retrieve all the values
		 * using 2 different (for and enhanced for) ways.
		*/	
	
	String make, model;
	int year;
	
	Car(String make, String model, int year)
	{
		this.make = make; 
		this.model = model; 
		this.year = year;
	}
	
	
	void printInfo()
	{
		System.out.println("This car is a " + make + " " + model + " of year " + year+ "!!");
	}
	
	
	
}
