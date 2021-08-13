package com.neotech.lesson17;

public class Homework2 {
	// Create a String that should be combination of letters,
	// numbers and special characters. Find out how many alpha
	// characters are there in the String.

	public static void main(String[] args) {

		String str = "Hello1234$%^&World679";

		String str2 = str.replaceAll("[^a-zA-Z]", "");
		// "[a-z]" = regular expression meaning from a to z

		System.out.println(str2);
		System.out.println("The length of the string is " + str2.length());

		System.out.println("Let's keep the numbers");
		String str3 = str.replaceAll("[^0-9]", "");
		System.out.println(str3);

		System.out.println("Let's keep the special characters");
		String str4 = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str4);

		System.out.println("------------------");

		String demo = str.replaceAll("[a-z]", "+");
		System.out.println(demo);

		// This is not a regular expression
		demo = str.replaceAll("a-z", "+");
		System.out.println(demo);

		// This is not what we want
		demo = str.replaceAll("[az]", "+");
		System.out.println(demo);

	}
}
