package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {

		String[][] months = {{"December", "January", "February"},
							{"March", "April","May"},
							{"June", "July", "August"},
							{"September", "October", "November"}};

		int rows = months.length;
		int cols = months[0].length;
		
		System.out.println("The number of  rows is " + rows+ " and the number of columns is "+ cols);
		
		
		for (int i = 0; i < rows; i++) //rows
		{
			for (int j = 0; j < cols; j++) //cols
			{
				System.out.println(months[i][j]);
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int[][] numbers = {	{1,4,6}, 
							{2,5,7,10}, 
							{8}			};
		
		
		for (int i = 0; i < numbers.length;i++)
		{
			
			System.out.println("Length of the colums for row "+  i + " is " + numbers[i].length );
			
			for (int j = 0; j < numbers[i].length;j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}

}
