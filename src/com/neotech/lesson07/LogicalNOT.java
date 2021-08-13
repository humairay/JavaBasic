package com.neotech.lesson07;

public class LogicalNOT {

	public static void main(String[] args) {
		// ! (NOT) - reversing the value of a boolean varible 
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
		
		//  !=  not equal   if (number != 5)
		
		
		//! can be put in front of any boolean
		
		boolean cold = !true;
		
		if (cold)
		{
			System.out.println("Cold!");
		}
		else
		{
			System.out.println("Not Cold!");
		}
		
		
		boolean isRaining = !true;
		
		if(isRaining)
		{
			System.out.println("Not Raining");
		}
		else
		{
			System.out.println("Raining");
		}
		
			
		
		
	}
	
	
}
