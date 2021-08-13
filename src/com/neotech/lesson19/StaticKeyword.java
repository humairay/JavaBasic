package com.neotech.lesson19;

public class StaticKeyword {
	
	
	//instance variables
	String color;
	int memory;
	
	//class/static variables
	static String brand;
	static boolean touchscreen;
	
	
	//not static --- instance method
	//instance methods can access and use all the variables inside the class.
	void displaySpecificInfo()
	{
		System.out.println("We build a " +  brand + " with " + memory + "GB with " + color +" color!");
	}
	
	static void displaySpecificInfo_2()
	{
		System.out.println("Brand is " + brand + " and touchscreen is " + touchscreen);
		//inside the static method you cannot call the instance variables.
	//	System.out.println("We build a " + brand + " with " + memory + "GB "+color+" color!");
	}
	
	public static void main(String[] args) {
		
		//when we access static variables, we do not need an object
		StaticKeyword.brand = "Iphone";
		StaticKeyword.touchscreen = true;
		
		
		StaticKeyword obj1 = new StaticKeyword();
		obj1.color = "black";
		obj1.memory = 64;
		
		obj1.displaySpecificInfo();
		
		//the static keyword has to be access as static
		StaticKeyword.touchscreen = false; //correct way to access a static variable
//		obj1.touchscreen = false;			//wrong way to access a static variable
		
		
		obj1.displaySpecificInfo_2(); //not the right way to access it
		StaticKeyword.displaySpecificInfo_2(); //the right way to access a static method
		
		
		//because we are in the same class, we can call these STATIC variable/method without the class name
		touchscreen = true;
		displaySpecificInfo_2();
		
		
		
	}
	
	// Go to the homework and keep the number of students in a static variable and create a static method to print 
	// the number of students
	//
	
	

}
