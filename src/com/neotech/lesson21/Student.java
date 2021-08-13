package com.neotech.lesson21;

public class Student {

	/*
	 * Write program as a Student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method.
	 * 
	 */

	// instance varialbes
	String name;
	String address;

	// how do we create an object of a class???
//	Student s = new Student() -->> this is the default constructor being called. 

	// default constructor
	public Student() {

	}

	// a constructor only with one parameter
	public Student(String name) {
		// assigning the incoming input to the instance variable
		this.name = name;
	}

	// a constructor with two parameters
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void displayInfo() {
		String name = "Sabah"; // local variable name
		System.out.println("Name Local: " + name + " Name Instance " + this.name + " Address " + address);
	}

}
