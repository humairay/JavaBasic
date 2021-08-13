package com.neotech.lesson15;

public class Calculator {

	// This method will accept two numbers (as parameters)
	// And will print the sum
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	// This method will accept two numbers (as parameters)
	// And will print the multiplication
	void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// This method will accept two numbers (as parameters)
	// And will print the division
	void divide(double a, double b) {
		System.out.println("I will divide " + a + " by " + b);
		double result = a / b;
		System.out.println("The result is " + result);
	}

}
