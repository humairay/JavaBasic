package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2a {

	
	public static void main(String[] args) {
	
		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
				• short (under 60 inch)
				• medium(between 60 -72 inch)
				• tall (over 72 inch)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int height;
		
		System.out.println("Please enter your height: ");
		height = scan.nextInt();
		
		if (height > 0 && height < 60)// ]0 - 60[
		{
			System.out.println("You classify as short!!!");
		}
		else if (height >= 60 && height <= 72) // [60 - 72]
		{
			System.out.println("You classify as medium!!!");
		}
		else if (height > 72) // ]72 - infinity
		{
			System.out.println("You classify as tall!!!");
		}
		else 
		{
			System.out.println("Invalid input!!!");
		}
		
		
		
		
		
		
		
	}
	
}
