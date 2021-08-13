package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name!");
		String name = input.next();
		System.out.println("Your name is: " + name);

		System.out.println("Please enter your age!");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
		
		System.out.println("Please enter your age as double!");
		double ageDouble = input.nextDouble();
		System.out.println("Your age in double is: " + ageDouble);
		
		System.out.println("Is it raining? (true/false)");
		boolean raining = input.nextBoolean();
		System.out.println("Is it raining? " + raining);
	}

}
