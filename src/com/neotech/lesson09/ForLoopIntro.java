package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {
		// print number 1 to 5

		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

		System.out.println("-----------------");

		// When we know how many time it will execute
		// we should go with For loop

		// three parts of a for loop
		// initialization; condition; increment
		for (int b = 1; b <= 5; b++) {
			System.out.println(b);
		}

	}

}
