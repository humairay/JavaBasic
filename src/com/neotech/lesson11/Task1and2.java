package com.neotech.lesson11;

public class Task1and2 {

	public static void main(String[] args) {


		/*
		 * 
		 * 
		 * 1. Create an array of chars and store grades into it: A,B,C,D,E,F.
		 * Then print a grade B (use 2 different ways of creating an array).
		 */
				
		
		//1st way: 
		char[] grades = new char[6];
		
		grades[0] = 'A';
		//same way for other grades
		
		//2nd way:
		char[] grades2 = {'A','B','C','D','E','F'};
		
		
		//printing 
		System.out.println(grades2[1]);
		
		/*
		 * 
		 * 2. Create an array of words: Java, Saturday, day, coding, is.
		 * Print the following sentence using elements of array:
		 * “Saturday is Java coding Day”.
		 * 		
		 */
		
		String[] strArray = {"Java", "Saturday", "day", "coding", "is"};
		
		System.out.println(strArray[1] +" "+ strArray[4] + " "+ strArray[0] + " "+ strArray[3]+" "+strArray[2]);
		
		
		
	}

}
