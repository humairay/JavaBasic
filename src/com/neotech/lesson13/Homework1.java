package com.neotech.lesson13;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. Create a 2D array where you will store the following values:
		 * - Mr, Mrs, Ms, Miss
		 * -Smith, Jordan, Jackson, Obama.
		 * After storing values print the following: 
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 * * Be careful because they are mixed.
		 * 
		 * 
		 */
		
		
		/*			col 0	  col 1   col 2   col 3
		 * row 0        Mr,   Mrs,    Ms,    Miss
		 * row 1 	Smith, Jordan, Jackson, Obama
		 * 
		 */
		
		
		
		 //names[0][0] --> Mr
		String[][] names = {    {"Mr","Mrs","Ms","Miss"},{"Smith","Jordan","Jackson","Obama"}
				
							};
		
		// Mrs Smith
		System.out.println(names[0][1] + " " + names[1][0]);
		//Mr Obama
		System.out.println(names[0][0] + " " + names[1][3]);
		//Ms Jackson
		System.out.println(names[0][2] + " "  + names[1][2]);
		//Miss Jordan
		System.out.println(names[0][3] + " " + names[1][1]);
		
		
	}

}
