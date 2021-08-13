package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrayWithForEachLoops {

	public static void main(String[] args) {

		String[][] animals = {
							{"cat", "dog", "bird"}, 
							{"tiger", "Wolf", "lion", "bear"},
							{"salmon", "shrimp", "crab"}
							};
		
		
		//print all elements with nested for loops
		
		
		for (int i = 0; i < animals.length;i++)
		{
			for (int j = 0; j < animals[i].length; j++)
			{
				System.out.print(animals[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//USING FOR EACH LOOP
		
		//elements of the animals array (2D) are {"cat", "dog", "bird"}, {"tiger", "Wolf", "lion", "bear"}
		for (String[] row : animals)
		{
			//we now loop through the elements found on the row 1D array   "cat", "dog", "bird"  ... "tiger", "Wolf", "lion", "bear"
			for (String col : row)
			{
				System.out.print( col +" ");
			}
			System.out.println();
		}
		
		
		//enhanced for to loop 2D array: 
		
		//first loop: for (datatype[] el : 2D array)    2D to 1D
		
		//second loop: 		for( datatype x : el (1D) )   elements of 1D
		
		
		
		int[][] points = {
						{90, 67, 88, 56}, 
						{85, 45, 90}, 
						{100, 99, 55, 87, 65}
							};
		
		//row values will be {90, 67, 88, 56}   
		for (int[] row : points) //the datatype of row??? from 2D to 1D
		{
			//point values will be 90, 67, 88, 56
			for (int point : row) //the datatype of point?  from 1D to element
			{
				System.out.print( point + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
