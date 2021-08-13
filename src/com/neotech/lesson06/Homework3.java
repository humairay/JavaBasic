package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
		// Write a Java Program to check whether number is Even or Odd.

		int number = 12;

		int remainder = number % 2;

		// 1st way
		if (remainder == 1) {
			System.out.println("This is an odd number!");
		} else {
			System.out.println("This is an even number!");
		}

		// 2nd way
		if (remainder == 0) {
			System.out.println("This is an even number!");
		} else {
			System.out.println("This is an odd number!");
		}

		// 3rd way
		if (number % 2 == 1) {
			System.out.println("This is an odd number!");
		} else {
			System.out.println("This is an even number!");
		}
		
	}

}
