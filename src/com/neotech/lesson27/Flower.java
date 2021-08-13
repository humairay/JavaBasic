package com.neotech.lesson27;

public abstract class Flower {

	public String type;
	
	public Flower(String type)
	{
		this.type = type;
	}
	
	public abstract void bloom();
	
}



class Tulip extends Flower
{
	//if we create an object of Tulip using the default constructor, 
	//it would mean that the default constructor of Flower will be called, and we don't have one

	Tulip(String type)
	{
		super(type);
	}

	@Override
	public void bloom() {

		System.out.println(type + " bloom in march!");		
	}
	
}

class Rose extends Flower
{

	public Rose(String type) {
		super(type);
	}

	@Override
	public void bloom() {

		System.out.println(type + " bloom in june!");
	}
	
}

class SunFlower extends Flower
{

	public SunFlower(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {

		System.out.println(type + " bloom in august!");
	}
	
}







