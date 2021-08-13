package com.neotech.lesson21;

//this, super, this(), super()

//this() - we use this(), to call another constructor within the same class
//super()- we use super(), to call another constructor of the super/parent class

//each one is called only in a constructor
//each one has to be on the first line of the constructor
public class Car {
	
	String make, model;
	
	Car()
	{
	//	this(" ", "" ); this will invoke another constructor of the same class
		System.out.println("I am a parent default constructor!!!!");
	}
	
	Car(String make)
	{
		this.make = make;
	}
	
	Car(String make, String model)
	{
		this.make = make;
		this.model = model;
	}
	

}




class Mercedes extends Car
{
	String sportsModel;

	
	//commenting the entire selection: ctrl + /
	Mercedes()
	{
		//we use this() to initialize the values to our defaults when the used 
		//called the default constructor and did not provide any values. 
		this("Default Make", "Default Model", "Default Sports");
		System.out.println("I am a child default constructor");
	}
	
	
	
	Mercedes(String make, String model, String sportsModel)
	{
		//call the super constructor to initialize instance variables 
		//in the parent class
		super(make, model);
		//use this keyword to initialize instance variables in the
		//child class 
		this.sportsModel = sportsModel;
	}
	
	void display()
	{
		System.out.println(make + " " + model +" "+ sportsModel);
	}
	
}









