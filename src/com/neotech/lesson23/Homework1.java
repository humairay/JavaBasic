package com.neotech.lesson23;

public class Homework1 {

	//method signature: info, no parameters
	static void info()
	{
		System.out.println("Today is Saturday!!!");
	}
	
	//method signature: info, String parameter
	static void info(String str)
	{
		System.out.println("Today is "+ str);
	}
	
	//method signature: info, String, int
	static void info(String str, int temp)
	{
		System.out.println("Today is " + str + " and the temperature is " + temp);
	}
	

	
	
	public static void main(String[] args) {
		//  Create 1 class with 3 overloaded static methods. Then call each overloaded methods with 
		//specific arguments and observe the results.

		info();
		info("Saturday");
		info("Saturday", 35);
		
	}

}
