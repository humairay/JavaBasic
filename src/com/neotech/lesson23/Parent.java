package com.neotech.lesson23;

public class Parent {

	Parent() {
		System.out.println("Parent Class Constructor");
	}

	//method signature: name + parameters 
	private void hello() {
		System.out.println("Hello from the Parent Class");
	}

	static void bye() {
		System.out.println("Bye from the Parent Class");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Child Class Constructor");
	}

	//super.hello();
	
	
	//we are not overriding, because we do not even have access to the private method of the parent class
	//here we are just creating a private method, seen only inside this class
	private void hello() {
		System.out.println("Hello from the Child Class");
	}
	
	//we are redeclaring a static method, but not overriding. 
	static void bye()
	{
		System.out.println("Goodbye from the child class");
	}
	
}
