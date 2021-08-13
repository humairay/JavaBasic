package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {

		// Task 3: Sum of all integers in a 2D array. (Use For and For Each) 
		
		
		int[][] num = {{3,5,4,5},{6,5},{2,4,8,4}}; 
		
		
		int sum = 0; 
		
		
		for (int i = 0; i < num.length; i++ )
		{
			for( int j = 0; j < num[i].length; j++)
			{
				sum = sum + num[i][j];
				//use the shorthand operator
				//sum+= num[i][j];
			}
		}
		
		System.out.println("the total sum of the integers in the 2D array is : " + sum);
		
		//using for each loop 
		
		int sum2 = 0; 
		
		for (int[] row : num)
		{
			for (int col : row)
			{
				sum2 += col;
			}
		}
		
		System.out.println("The total sum using the for each loop is : " + sum2);
		
		
		
		
	}

}
