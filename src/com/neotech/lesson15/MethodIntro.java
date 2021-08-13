package com.neotech.lesson15;

public class MethodIntro {

	// Let me create a method for greeting
	void greet() {
		System.out.println("Hello");
		System.out.println("How are you doing");
		System.out.println("Bye");
	}

	// Let me create a method that will be greeting by name
	void greet2(String name) {
		System.out.println("Hello " + name);
		System.out.println("How are you doing");
		System.out.println("Bye " + name);
	}

	public static void main(String[] args) {
		MethodIntro object = new MethodIntro();
		object.greet();
		object.greet();

		System.out.println("==============");
		object.greet2("Komron");
		object.greet2("Evis");

		System.out.println("==============");
		// object.greet2(); // Compile Error
		// object.greet2('M'); // Compile Error
		// object.greet2(5); // The method expects a String, not an integer

		object.greet2(""); // No error, because I am passing an Empty String
	}
}
