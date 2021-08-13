package com.neotech.lesson10;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a program using while loop that calculates the sum of the even
		 * numbers between 0 and 10.
		 */

		int sum = 0;

		// between 0 and 10 ---> run a loop from 0 to 10

		// 1st way:
//		0 2 4 6 8 10
		int i = 0;
		while (i <= 10) {

			sum = sum + i;

			// increment
			i += 2;
		}

		System.out.println("Sum using 1st way: " + sum);
		
		int sum1 = 0;
		int j = 0; 
		//2nd way: 
//		0 1 2 3 4 ... 10
		
		while(j <=10)
		{
			
			//filter by if condition
			if(j % 2 == 0) //if remaining of the operation is equal to 0, we say its fully divisible
			{
				sum1  = sum1 + j; //sum += j
			}
			
			
			//increment 
			j++;
		}
		
		System.out.println("Sum usign the 2nd way: " + sum1);
		
		
	}

}
