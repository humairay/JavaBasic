package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		// declare a variable
		Phone iPhone;

		// creating an instance/object and assigning it to the variable
		iPhone = new Phone();
		iPhone.brand = "Apple";
		iPhone.color = "Red";
		iPhone.model = "12 Pro";
		iPhone.price = 1300;

		iPhone.call();
		iPhone.text();
		iPhone.navigate();

		System.out.println("==================");
		Phone android = new Phone();

		// I am assigning the properties/variables
		android.brand = "Samsung";
		android.color = "Silver";
		android.model = "S21";
		android.price = 800;

		// I am calling/executing the methods
		android.call();
		android.text();
		android.navigate();

		System.out.println("==================");

		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Black";
		nokia.model = "Lumnia";
		nokia.price = 50;

		nokia.call();
		nokia.call();
		nokia.call();
		nokia.text();
		nokia.navigate();

		// I want to print:
		// I have a Black Nokia which costs 50 dollars
		System.out.println("I have a " + nokia.color + " " + nokia.brand + " which costs " + nokia.price + " dollars");

		// I want to print
		// Samsung s21 costs 800$
		System.out.println(android.brand + " " + android.model + " costs " + android.price);
	}
	
	//Break until 8:10
}
