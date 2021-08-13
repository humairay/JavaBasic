package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
	
		double d1 = 12.3;
		double d2 = 12.2;
		
		//d1 > d2  its the same as d2 < d1
		//possible conditions: 
		// d1 is bigger than d2
		// d1 is smaller than d2
		// d1 is equal to d2 (d1 == d2 is same as d2 == d1)
		
		
		if (d1 < d2) // d1 is smaller than d2
		{
			System.out.println("Number "+d1 +" is smaller than "+d2);
		}
		else if (d1 > d2)  // d1 is larger than d2
		{
			System.out.println("Number "+ d1+ " is bigger than "+ d2);
		}
		else // this means that d1 == d2
		{
			System.out.println("Number "+ d1+ " is equal to "+d2);
		}
		
		////Let's code it again
		
		int a = 6;
		int b = 6;
		
		//possible situations:
		//1. a is bigger than b  	(b is smaller than a)
		//2. a is smaller than b 	(b is bigger than a)
		//3. a is equal to b 		(b is equal to a)
		
		//these conditions are exclusive (if one of them is true, the others are NOT true)
		//Java is Case-Sensitive
		if (a == b)
		{
			System.out.println("Number "+a+ " is equal to " + b);
		}
		else if (a < b)
		{
			System.out.println("Number " + a + " is smaller than "+b);
		}
		else  // a > b
		{
			System.out.println("Number " + a + " is bigger than "+b);
		}
		
	}
}
