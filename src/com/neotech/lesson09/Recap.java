package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		// Let's print "Hello" 5 times

		// 1st way, you will go to jail
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");
		// System.out.println("Hello");

		// 2nd way, Using while loop
		int i = 1;
		while (i <= 5) {
			System.out.println("Hello");
			i++;
		}

		System.out.println("-----------------------");

		// 3rd way, Using do-while loop
		int j = 1;
		do {
			System.out.println("Hello");
			j++;
		} while (j <= 5);

		System.out.println("*************************");
		System.out.println("Using While");

		int k = 10;
		while (k <= 5) {
			System.out.println("Bye");
			k++;
		}

		System.out.println("-----------------------");
		System.out.println("Using do-while");
		int m = 10;
		do {
			System.out.println("Bye");
			m++;
		} while (m <= 5);

	}

}
