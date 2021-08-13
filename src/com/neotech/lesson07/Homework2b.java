package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2b {

	public static void main(String[] args) {
		
		
		/*
		 * 2. Write a program that will print whether it is a weekend or weekday.
		 * If any day from 1-5 → output “It is a weekday”
		 * Any day from 6-7 → output “It is a weekend”,
		 * Any other day → output “Invalid day”
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int day;
		
		//ask user to enter a number from 1-7:
		System.out.println("Please enter the day number: ");
		day = scan.nextInt();
		
		////////USING && OPERATOR///////////////
		
		if (day >=1 && day <=5 ) //[1 - 5] or ]0 - 6[
		{
			System.out.println("It is a weekday!");
		}
		else if (day >=6 && day<=7)//[6 - 7] or you can say also ]5 - 8[
		{
			System.out.println("It is a weekend!");
		}
		else 
		{
			System.out.println("That is not a day!!!");
		}
		
		////////USING || OPERATOR////////////////////
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
		{
			System.out.println("It is a weekday!!!");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("It is a weekend");
		}
		else 
		{
			System.out.println("This is not a day!!!");
		}
		
		
		///////USING && and || OPERATORS////////
		if(day >= 1 && day <= 5)
		{
			System.out.println("It is a weekday!");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("It is a weekend!");
		}
		else 
		{
			System.out.println("this in not a day!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
