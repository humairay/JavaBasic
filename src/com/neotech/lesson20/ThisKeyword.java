package com.neotech.lesson20;

public class ThisKeyword {

	int a, b;

	public ThisKeyword() {
		System.out.println("I am a default constructor!");
	}

	public ThisKeyword(int a, int b) {
		// this keyword
		// we are trying to assign the value that we get as a parameter
		// to the instance variable
		// this.a refers to the instance variable
		// a is a local variable
		this.a = a;
		// assigning the local variable b to the instance variable this.b
		this.b = b;
	}

	void sum() {
		// I can use this.a or just a
		int sum = this.a + b;
		System.out.println("The sum is " + sum);
	}

}
