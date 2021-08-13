package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {
	// Write a program that asks user to enter first name and then last name.
	// At the end system should display user’s full name.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your first name!");
		String firstName = scan.next();
		
		System.out.println("Please enter your last name!");
		String lastName = scan.next();
		
		System.out.println("Your full name is: " + firstName + " " + lastName);
	}
}
