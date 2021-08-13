package com.neotech.lesson22;

public class MathTeacher extends Teacher {
	String field;

	MathTeacher() {
		System.out.println("Default contructor for MathTeacher class");
	}

	MathTeacher(String firstName, String lastName, String field) {
		super(firstName, lastName); // has to be the first line
		this.field = field;
	}
	
	void teachingMath() {
		System.out.println("Teaching Math...");
	}
}
