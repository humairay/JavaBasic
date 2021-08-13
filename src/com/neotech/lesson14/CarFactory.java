package com.neotech.lesson14;

public class CarFactory {

	
	public static void main(String[] args) {
		
		

		Car car1 = new Car(); //car1 is the object
		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Blue";
		car1.year = 2012;
		
		car1.drive();
		car1.stop();
		car1.transportPeople();
		
		
		
		Car car2 = new Car();
		car2.make = "Honda";
		car2.model = "Accord";
		car2.color = "Green";
		car2.year = 2013;
		
		car2.transportPeople();
		
		
		
		System.out.print(car1.make + " " + car1.model + " "+car1.color + " "+ car1.year);
		
		
		
	}
	
}
