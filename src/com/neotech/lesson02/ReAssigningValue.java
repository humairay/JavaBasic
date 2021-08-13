package com.neotech.lesson02;

public class ReAssigningValue {

	public static void main(String[] args) {
		// 1. declaring
		int number1;

		// compiler error, I cannot print before I store a value
		// System.out.println(number1);

		// 2. assigning
		number1 = 92;
		System.out.println(number1);

		// 3. re assigning
		number1 = 273;
		System.out.println(number1);

	}

}
