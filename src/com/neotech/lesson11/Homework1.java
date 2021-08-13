package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask the user to enter an integer and build the following pattern:
		 			*********
		 			 *******
		 			  *****
		 			   ***
		 			    *
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number: ");
		num = scan.nextInt();

		//	* * *   3 0
		//	 * *    2 1
		//	  *	    1 2

		
		for (int i = num; i > 0; i-- )   // for (int i = 1; i <=n;i++)
		{
			for(int j = 0; j < num-i; j++) // for (int j = 1; j < i; j++)
			{
				//1st loop: i = 3, num = 3, j starts at 0 and goes up to num-i ->0   so no print
				//2nd loop: i = 2, num = 3, j starts at 0 and goes upt to 1  so 1 space
				
				System.out.print("+");
			}
			
			for(int k =0 ; k < i; k++)
			{
				//1st loop: i = 3, num = 3, k starts at 0 and goes up to 3
				//2nd loop: i = 2, num = 3, k starts at 0 and goes up to 2
				System.out.print("* ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
