package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * 
		 * Task 4: Create an array of cars : American, German, Korean, Italian. 
		 * Then retrieve all values from that array using 2 different loops
		 * 
		 */
		
		
		String[][] cars = {{"Ford", "Chevy", "Tesla"}, {"Bmw", "MB", "Audi"}, 
						{"Subaru","Kia","Hundayi"}, {"Ferrari", "Fiat", "Lamborghini"} };
		
		
		
		//using a for loop
		
		for (int i = 0; i < cars.length; i++)
		{
			for( int j = 0; j < cars[i].length; j++)
			{
				
				System.out.print(cars[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		//using for each:
		for (String[] country: cars)
		{
			for(String car:country)
			{
				System.out.print(car + " ");
			}
			System.out.println();
		}
		
		
	}

}
