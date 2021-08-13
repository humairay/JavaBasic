package com.neotech.lesson20;

public class ConstructorTypes {

	ConstructorTypes() {
		System.out.println("I am a non-argument constructor");
	}

	ConstructorTypes(String str) {
		System.out.println("I am a constructor with a string parameter: " + str);
	}

	ConstructorTypes(int num) {
		System.out.println("I am a constructor with an int parameter: " + num);
	}

	ConstructorTypes(double num) {
		System.out.println("I am a constructor with a double parameter: " + num);
	}

	ConstructorTypes(String name, int age) {
		System.out.println("My name is " + name + " and my age is " + age);
	}

	public static void main(String[] args) {
		System.out.println("Before");

		ConstructorTypes ct = new ConstructorTypes("Flori", 17);

		System.out.println("After");

	}
}
