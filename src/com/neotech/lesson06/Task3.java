package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	// Write a program that asks user to enter two numbers and prints which one is
	// larger.
	public static void main(String[] args) {
		// I am declaring a variable of type Scanner
		Scanner console;

		// I am assigning a value to the variable
		console = new Scanner(System.in);

		System.out.println("Please enter the first number!");
		int num1 = console.nextInt();

		System.out.println("Please enter the second number!");
		int num2 = console.nextInt();

		System.out.println("-----------------------");
		System.out.println("Your numbers are " + num1 + " and " + num2);
		System.out.println("-----------------------");

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

	}
}
