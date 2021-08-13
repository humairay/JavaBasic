package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter an integer and build the following pattern:

				1 
				1 2 
				1 2 3 
				1 2 3 4 
				1 2 3 4 5 
				1 2 3 4 
				1 2 3 
				1 2 
				1
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		
		
		
		for(int i = 1; i<=num ; i++)
		{
			//1st loop: i = 1, i want j to run only once  ( 1
			//2nd loop: i = 2, i want j to run two times  (1 2 
			for(int j = 1; j <= i;j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		
		for (int i = num; i > 0; i-- )
		{	
			//1st loop: i = 5, j will run from 1 to 4
			//2nd loop: i = 4, j will run from 1 to 3
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
