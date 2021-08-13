package com.neotech.lesson22;

public class A {
	// Write program for multilevel inheritance where class A
	// inherited by B and class B inherited by class by C.
	String name = "A";

	void method() {
		System.out.println("This is a method in class A!");
	}
}

class B extends A {
	String name = "B";

	void method() {
		System.out.println("This is a method in class B!");
		System.out.println(this.name); // B
		System.out.println(super.name); // A
		super.method();
	}
}

class C extends B {
	String name = "C";

	void method() {
		System.out.println("This is a method in class C!");
		System.out.println(super.name);
		super.method();
	}
}
