package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of integers and calculate the sum of all elements in the
		// array
		// (use 2 different loops).

		int[] numbers = { 23, 87, 55, 93, 12, 25 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum is " + sum);

		// 2nd way
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		System.out.println("The total is " + total);
	}
}
