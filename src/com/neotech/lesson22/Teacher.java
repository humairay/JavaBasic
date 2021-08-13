package com.neotech.lesson22;

public class Teacher {
	// Write a Java program called Teacher. Identify features and
	// behaviour of that Class. Create 3 subclasses MathTeacher,
	// ChemistryTeacher and PianoTeacher that would have it their
	// own features and behaviour. Test all 4 classes.

	String firstName, lastName;

	Teacher() {
		System.out.println("Default contructor for Teacher class");
	}

	Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void teaching() {
		System.out.println("Teaching...");
	}

}
