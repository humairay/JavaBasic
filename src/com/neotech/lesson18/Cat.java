package com.neotech.lesson18;

public class Cat {

	//instance variables
	String name; 
	String color; 
	int age;
	
	
	
	void sayMeow()
	{
		String word = "meow"; // this is a local variable
	}
	
	
	void displayCatInfo()
	{
		System.out.println("Name: " + name +" Color: "+ color +" age: " + age);
	}
	
	
}
