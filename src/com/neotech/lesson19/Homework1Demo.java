/**
 * 
 */
package com.neotech.lesson19;


public class Homework1Demo {


	public static void main(String[] args) {

		Homework1 st1 = new Homework1();
		st1.studentName = "Mehmet";
		st1.studentID = 1;
		//increment the number of students
		Homework1.numberOfStudents++;
		
		
		
		Homework1 st2 = new Homework1();
		st2.studentName = "Ivonne";
		st2.studentID = 2;
		//increment the student number
		Homework1.numberOfStudents++;
		
		
		
		
		
		Homework1 st3 = new Homework1();
		st3.studentName = "Komron";
		st3.studentID = 3;
		Homework1.numberOfStudents++;
		
		System.out.println("The total number of students is "
							+Homework1.numberOfStudents);
		
		
	}

}
