package com.neotech.lesson19;

public class Task2 {

	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name.
	 */

	public static String reverse(String str) {
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		return reverse;
	}

}
