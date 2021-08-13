package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {

		
		/*
		 * 
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 
		 * 
		 * 
		 */

		for(int i = 0; i < 5; i++) //this will get executed 5 times from 0 1 2 3 4 
		{
			//for i = 0, j goes from 0  to 0 
			
			for(int j = 0; j <= i; j++) //this will execute depending on i
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 	
		 	******
		 	****
		 	***
		 	**
		 	*
		 	
		 */
		
		
		for(int i = 5; i > 0; i--) //i goes from 5 4 3 2 1
		{
			for (int j = 1; j < i; j++) // go from j to i, but i changes every loop 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Controlling the FOR loop
		//ask a user to enter a number
		int num = 9;
		
		for (int i = 0; i < num; i++)
		{
			System.out.print(i + " ");
		}
		
		
		
	}

}
