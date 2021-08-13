package com.neotech.lesson20;

public class CarTest {

	public static void main(String[] args) {

		// 1st way
		Car c = new Car();
		c.printDetails();

		c.brand = "Tesla";
		c.model = "Model S";
		c.year = 2021;

		c.printDetails();

		// 2nd way
		Car c2 = new Car("X5", "BMW", 2021);
		c2.printDetails();

	}

}
