package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		/*
		 * 2. Create a program that will be asking user to apply for a credit card 10 times.
		 * As soon you get a "yes" from a user program should stop asking.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String input; 
		
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Do you want to apply for a credit card??");
			input = scan.next();
			
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Great!");
				break;
			}	
			
		}
		
		
		
		
	}

}
