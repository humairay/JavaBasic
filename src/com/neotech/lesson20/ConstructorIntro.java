package com.neotech.lesson20;

public class ConstructorIntro {

	// We decide what happens when we are creating the object
	public ConstructorIntro() {
		System.out.println("An object of ConstructorIntro is being created");
	}

	public static void main(String[] args) {

		System.out.println("---Before creating the object---");

		// we are creating an object of ConstructorIntro class
		ConstructorIntro c = new ConstructorIntro();

		System.out.println("---After creating the object---");

	}

}
