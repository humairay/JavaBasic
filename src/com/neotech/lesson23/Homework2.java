package com.neotech.lesson23;

public class Homework2 {

	//method signature: info, no parameters
	private void info()
	{
		System.out.println("Today is Saturday!!!");
	}
	
	private void info(String str)
	{
		System.out.println("Today is " + str);
	}
	
	private void info(String str, int temp)
	{
		System.out.println("Today is " + str + " and the temperature is " + temp);
	}
	
	
	public static void main(String[] args) {
		/* Create a class with 3 overloaded private methods. Then call each overloaded 
		 * methods with specific arguments and observe the results.
		 */
		Homework2 h2 = new Homework2();
		
		h2.info();
		h2.info("Saturday");
		h2.info("Saturday", 35);
		
		

	}

}
