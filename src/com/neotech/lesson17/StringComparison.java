package com.neotech.lesson17;

public class StringComparison {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");

		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println("----Comparing using == operator----");

		if (str1 == str2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

		System.out.println("----Comparing str1==str3----");

		String str3 = "Hello";
		if (str1 == str3) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}

}
