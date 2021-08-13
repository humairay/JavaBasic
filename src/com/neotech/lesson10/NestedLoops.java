package com.neotech.lesson10;

public class NestedLoops {

	public static void main(String[] args) {

		
		for (int i = 0; i < 5; i++)
		{
//			System.out.println("Outer loop");
//			System.out.println("i: " + i);
			
			
			for (int j = 0 ; j < 5; j++)
			{
//				System.out.println("Inner loop.");
				
				System.out.println("i: "+ i + " j: " + j);
				
//				System.out.println("End of inner loop.");
			}
			
//			System.out.println("End of outer loop");
		}
		

		
	}

}
