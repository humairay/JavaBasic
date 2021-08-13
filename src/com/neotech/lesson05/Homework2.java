package com.neotech.lesson05;

public class Homework2 {

	public static void main(String[] args) {
	/*
	 * 
	 * 2. Create a Java program and name it Temperature Check. Create variable to store temperature.
		Your program should check if temperature is below 32   ---> temperature < 32
		If temperature is below then it should print “Water will freeze with temperature __”, 
		otherwise “Water will NOT freeze with temperature __”.
	 */
		
		int temperature = 25;
		
		System.out.println(temperature < 32);
		
		
		if (temperature < 32)//if (condition) 65 < 32
		{
			System.out.println("Water will freeze with temperature " + temperature);
		}
		else
		{
			System.out.println("Water will not freeze with temperature " + temperature);
		}

		
	}
}
