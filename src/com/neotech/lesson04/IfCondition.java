package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {
		// Declare a number and compare if the number is larger than 100
		// If it is larger than 100, Let's print my number is large

		int num = 79;

		if (num > 100) {
			System.out.println("My number is large");
		}

		System.out.println("End of code1");

		System.out.println("--------------------------");

		num = 157;
		boolean condition = num > 100; // condition is true

		if (condition) {
			System.out.println("My number is large");
		}
		
		System.out.println("End of code2");
		System.out.println("--------------------------");

	}

}
