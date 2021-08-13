package com.neotech.lesson13;

public class Task1and2 {

	public static void main(String[] args) {


		//Task 1: print all the items in an int 2D array
		
		int[][] num = {{2,5,7,4},{3,5,9},{3,5,2,4,8},{6}};
		
		
		for (int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num[i].length; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		//Task 2: print all even numbers from the array
		
		for (int i = 0; i < num.length; i++)
		{
			for (int j = 0; j < num[i].length; j++)
			{
				
				//check for even number
				if (num[i][j] % 2 == 0)
				{
					System.out.print(num[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
