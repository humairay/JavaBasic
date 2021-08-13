package com.neotech.lesson03;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * 1-In your program create different type of variables to store student’s
		 * information and then print value of those variables:
		 * name  lastName  grade  city  state
		 */

		String name = "Mehmet"; 
		String lastName = "Bushaj";
		char grade = 'A';
		String city = "NYC";
		String state = "NY";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
		//What if we want to print them in one sentence????
		 // we can use concatenation
		
		System.out.println(name + " " + lastName + " " + grade +" "+ city +" "+ state);
		
		// what if we use System.out.print();
		// System.out.print() does not print a new line
	//	System.out.print(name);
	//	System.out.print(lastName);
		
	}

}
