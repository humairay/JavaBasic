package com.neotech.lesson22;

public class Shape {
	// Write program: Shape class has a constructor that takes
	// the radius and has a subclass as Circle class. In Circle
	// class create a method to calculate the area of circle. Test
	// your code

	double radius;

	Shape(double r) {
		radius = r;
	}

}

class Circle extends Shape {

	Circle(double r) {
		super(r);
	}

	// create a method to calculate the area of circle
	void areaOfCircle() {
		System.out.println("The area of the circle is: " + 3.14 * radius * radius);
	}
}
