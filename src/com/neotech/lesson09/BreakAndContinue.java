package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {

		System.out.println("------BREAK------");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I reached the break keyword");
				break;
			}

			System.out.println(i);
		}

		System.out.println("------CONTINUE------");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I reached the continue keyword");
				continue;
			}

			System.out.println(i);
		}

	}

}
