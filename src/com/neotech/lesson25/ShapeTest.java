package com.neotech.lesson25;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.calculateArea(2);
		circle.calculatePerimeter(2);

		Square square = new Square();
		square.calculateArea(2);
		square.calculatePerimeter(2);

		System.out.println("---------------------------------");
		
		// using Parent reference
		Shape shape = new Circle();
		shape.calculateArea(5);
		shape.calculatePerimeter(5);
	}

}
