package com.neotech.lesson13;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 2. Create a 2D array that first row will contain 4 names and second row will 
		 * contain grades, all Strings.Then you program should print name of the students 
		 * that has A and B grade
		 * 
		 */
		
		
					//start from 0 up to the length of the lists
		String[][] students = {	{"Flori", "Mehmet", "Hakan", "Sabah"},
									{"A",	"A",		"B", 	"F"}};
		
		//print them directly: 
	System.out.println(students[0][0] + " " + students[0][1] + " "+ students[0][2]);
	
	//lets do it using loops
	
	//reminder: 
	//length of array: students.length ---> number of rows
	System.out.println("Length of 2D array: " + students.length);
	//length of a specific row: students[1].length ---> number of columns
	System.out.println("Length of row inside a 2D array: " + students[1].length);
	for ( int i = 0; i < students[1].length; i++ )
	{
		if(students[1][i].equals("A")   || students[1][i].equals("B"))
		{
			System.out.println(students[0][i]);
		}
	}
	
	
	
	
	}

}
