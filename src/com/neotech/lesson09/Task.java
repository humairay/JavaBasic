package com.neotech.lesson09;

public class Task {

	public static void main(String[] args) {
		// Print numbers from 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("--------------");
		// Print even numbers from 20 to 1 (2 ways)
		for (int i = 20; i >= 1; i -= 2) { // decreasing by 2
			System.out.println(i);
		}

		System.out.println("--------------");
		for (int i = 20; i >= 1; i--) {// decreasing by

			if (i % 2 == 0) {// if number is even
				System.out.println(i);
			}

		}

	}

}
