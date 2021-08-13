package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

		// 1st way, using the default constructor
		Student s1 = new Student();
		s1.name = "Mufasa";
		s1.address = "123 prospect";
		s1.displayInfo();

		// 2nd way, using the constructor with one variable
		Student s2 = new Student("Shodmon");
		s2.address = "124 prospect";
		s2.displayInfo();

		// 3rd way, using the constructor with two parameters

		Student s3 = new Student("Sabah", "124 prospect");
		s3.displayInfo();

	}

}
