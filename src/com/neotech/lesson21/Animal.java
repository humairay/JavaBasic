package com.neotech.lesson21;

public class Animal {

	//instance variables
	public String color, size; 
	public int age; 
	
	
	
	public void sleep()
	{
		System.out.println("All the animals sleep");
	}
	
	public void eat()
	{
		System.out.println("All animals eat");
	}
	
	public void displayInfo()
	{
		System.out.println(size + " " + color + " " + age);
	}
	
	
}
