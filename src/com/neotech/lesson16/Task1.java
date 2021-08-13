package com.neotech.lesson16;

public class Task1 {

	// Create a String and print it in reverse order (Sunday → yadnuS).

	/*
	 * Hint:
	 * 		Use a decrementing loop
	 * 		.length() --> to define the for loop
	 *		.chartAt(i) --> to get one character at a specific position
	 */

	public static void main(String[] args) {
		String day = "Sunday";

		String dayReverse = "";

		for (int i = day.length() - 1; i >= 0; i--) {
			dayReverse += day.charAt(i);
		}

		System.out.println(dayReverse);

	}

}
