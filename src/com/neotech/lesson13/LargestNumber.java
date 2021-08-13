package com.neotech.lesson13;

public class LargestNumber {

	public static void main(String[] args) {
/*
 * 
 * How to find the largest element in an array??
 * 
 */
		
		int[] numbers = {25, 130, 2456, 20, 50, 35, -10};
		
		int largest = numbers[0];
		
		//int largest = -999999999
		
		// travel all the array and compare your largest number with numbers in the array
		for (int i = 0; i < numbers.length; i++ )
		{
			if(largest < numbers[i])
			{
				largest = numbers[i];
			}
		}
		
		System.out.println("Largest number is : "+ largest);
		
		
		//can you apply the same logic to find the smallest number???
		
	}

}
