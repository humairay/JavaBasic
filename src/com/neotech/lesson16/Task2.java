package com.neotech.lesson16;

public class Task2 {
	// Create a String and if the String is not empty perform the following:
	// if the String has an odd number of characters and has 3 or more characters,
	// print the character in the middle of the String.

	public static void main(String[] args) {
		String str = "saturrr";

		if (!str.isEmpty()) {

			int length = str.length();

			if (length % 2 == 1 && length >= 3) {
				// if the length is 7 -> 0,1,2,3,4,5,6

				char middle = str.charAt(length / 2); // 7/2=3; we get the letter with index 3
				System.out.println(middle);
			} else {
				System.out.println("The condition is not true");
			}

		} else {
			System.out.println("The string is empty!");
		}

	}

}
