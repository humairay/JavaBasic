package com.neotech.lesson25;

public interface Shape {
	void calculateArea(double a);

	void calculatePerimeter(double a);
}

class Circle implements Shape {
	@Override
	public void calculateArea(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("The area of the circle is " + area);
	}

	@Override
	public void calculatePerimeter(double radius) {
		double perimeter = 2 * 3.14 * radius;
		System.out.println("The perimeter of the circle is " + perimeter);
	}
}

class Square implements Shape {
	@Override
	public void calculateArea(double side) {
		double area = side * side;
		System.out.println("The area of the square is " + area);
	}

	@Override
	public void calculatePerimeter(double side) {
		double perimeter = 4*side;
		System.out.println("The perimeter of the square is " + perimeter);
	}
}