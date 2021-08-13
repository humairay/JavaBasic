package com.neotech.lesson22;

public class Addition {

	// The name of the method and parameters must be unique!!!

	void add(int a, int b) {
		System.out.println(a + b);
	}

	// not method overloading
	// void add(int num1, int num2) {
	// System.out.println(num1 + num2);
	// }

	// method overloading by changing the number of parameters
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// method overloading by changing the type of parameters
	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(double a, double b, double num3) {
		System.out.println(a + b + num3);
	}

	// both at the same time
	void add(double d, int i) {
		System.out.println(d + i);
	}

	// The order is important
	void add(String s, int i) {
		System.out.println("You cannot add them!!!");
	}

	// method overloading by changing the order of parameters
	void add(int i, String s) {
		System.out.println("You cannot add them!!!");
	}

}
