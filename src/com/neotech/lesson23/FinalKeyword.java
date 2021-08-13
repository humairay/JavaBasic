package com.neotech.lesson23;

public class FinalKeyword {
	//final variables
	public static String hello = "Hello!";
	public static final String goodbye = "Goodbye!";
	
	public static final double PI = 3.14; //PI will not change 
	
	
	//can we overload? 
	//can we override?
	protected final void hello()
	{
		System.out.println("I am a final method");
	}
	//for overloading, we need to change the number or the type of the parameters
	public final void hello(String name) //overloading works for final keyword
	{
		System.out.println("Hello " + name);
	}
	
	
	public static void main(String[] args) {
	//	goodbye = "Bye";  // CE: you cannot modify a final variable
		
		final int age = 25;
		//age = 26; 
		
		
	}
	
}

final class SubClass extends FinalKeyword
{
//	public void hello() //CE: You cannot override a final method
//	{
//		
//	}
	
	public void hello(int num) //new method, not overriding. signature is different
	{
		
	}
}

//class SubSubClass extends SubClass //cannot extend a final Class
//{
//	
//}

