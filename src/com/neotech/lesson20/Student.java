package com.neotech.lesson20;

public class Student {
	// Write a java program of Class Student that takes students name and 3 subject
	// grades. Inside your class also have a method to Calculate Average Grade. Test
	// Student class for 5 different students with different marks. Your program
	// should print an average mark of each students name.

	String name;
	int grade1, grade2, grade3;

	Student(String stName, int gr1, int gr2, int gr3) {
		name = stName;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
	}

	int gradeAverage() {
		return (grade1 + grade2 + grade3) / 3;
	}

	public static void main(String[] args) {
		// I cannot use the constructor with no parameters
		// Student s = new Student(); //compiler eror

		// creating objects using the constructor with parameters
		Student s1 = new Student("Mufasa", 90, 80, 100);
		Student s2 = new Student("Murat", 95, 83, 99);
		Student s3 = new Student("Shodmon", 0, 100, 100);
		Student s4 = new Student("Hakan", 100, 100, 95);

		// for each object I am printing the name and the average
		System.out.println("Student " + s1.name + " has an average of " + s1.gradeAverage());
		System.out.println("Student " + s2.name + " has an average of " + s2.gradeAverage());
		System.out.println("Student " + s3.name + " has an average of " + s3.gradeAverage());
		System.out.println("Student " + s4.name + " has an average of " + s4.gradeAverage());

	}
}
