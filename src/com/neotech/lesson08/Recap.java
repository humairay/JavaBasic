package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		//find the largest among three numbers
		
		Scanner scan  = new Scanner(System.in);
		
		//declare variables
		double num1, num2, num3;
		
		//scan and assign variables
		System.out.println("Please enter three numbers: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		//using nested if's
		
		if (num1 > num2)
		{
			//check also if num1 is bigger than num3
			if(num1 > num3)
			{
				//here means that: num1 is larger than num2 and num3 ---> num1 is the largest
				System.out.println("The largerst number is "+num1);
			}
			else //num1 is smaller than num3
			{
				// means that: num3 is the largest
				System.out.println("The largest number is "+num3);
			}
		}
		else//means that num2 is larger than num1
		{
			//check also if num2 is larger than num3
			if (num2 > num3)
			{
				//num2 is the largest
				System.out.println("The largest number is " + num2);
			}
			else //num2 is smaller than num3
			{
				//since num2 is smaller than num1 and num3 is larger than num2 --> num3 is the largest
				System.out.println("The largest number is "+num3);
			}
		}
		
		
		
		
		
		
		
	}
	
}
