package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {


		String[] students = new String[6];//default value for strings is null
		
		students[0] = "Maryam";
		students[1] = "Ozel";
		students[2] = "Sahin";
		students[3] = "Ivonne";
		
		System.out.println(students[1]);
		
		
		//how do we get the length of the array
		
		int lengthOfStudentsArray = students.length;
		
		System.out.println("The length of the array is: " + lengthOfStudentsArray);
		
		//another way to declare arrays  
		int[] scores = {50, 55, 89, 90, 67} ; 
					  //0    1   2   3   4
		
		int lengthOfScoresArray = scores.length;
		
		System.out.println("The length of the array is: " + lengthOfScoresArray);
		
		
		
		
	}

}
