package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Burhan";
		s1.surname = "Yildiz";
		s1.school = "Neotech Academy";
		s1.studentID = 1;
		s1.age = 20;

		s1.study();
		s1.doHomework();

		Student s2 = new Student();
		s2.name = "Hakan";
		s2.surname = "K";
		s2.studentID = 2;
		s2.school = "Neotech Academy";

		s2.studentInfo();

		System.out.print(s2.name + " " + s2.surname + " " + s2.school);

	}

}
