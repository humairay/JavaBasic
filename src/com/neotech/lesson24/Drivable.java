package com.neotech.lesson24;

public interface Drivable {
	
	//this is a PUBLIC STATIC FINAL boolean MOVE_FAST, this is added by java itself.
	boolean MOVE_FAST = true;
	
	//even though we are not saying abstract in front of it, Java adds it itself
	//because every method created in an interface is abstract
	void drive();
}


interface B 
{
	
}

abstract class Vehicles
{
//here we can define implemented methods and undefined/abstract methods
	void start()
	{
		System.out.println("Vehicles can start!!!");
	}
	
	abstract void stop();
	
}

//achieving multiple inheritance
class Cars extends Vehicles implements Drivable, B
{

	//a class extends another class
	//a class implements an interface
	//an interface extends an interface
	
	@Override
	void stop() {
		System.out.println("Cars stop!!");
		
	}

	@Override
	public void drive() {
		System.out.println("Cars drive");
		
	}

	
}





