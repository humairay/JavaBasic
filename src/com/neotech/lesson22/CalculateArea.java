package com.neotech.lesson22;

public class CalculateArea {

	// Task 1:
	// Create a class named CalculateArea in which you should create three methods
	// (with the same name) that will calculate the area (volume) of
	// * Rectangle
	// * Square
	// * Box
	//
	// Use a separate class to test your code

	static void area(int side) {
		System.out.println("The area of the Square is: " + side * side);
	}

	static void area(int a, int b) {
		System.out.println("The area of the Rectangle is: " + a * b);
	}

	static void area(int length, int width, int height) {
		System.out.println("The area of the Box is: " + length * width * height);
	}

}
