package com.neotech.lesson23;

public class Animal {

	public void eat()
	{
		System.out.println("Animal eats");
	}
	
	public void sleep()
	{
		System.out.println("Animal sleeps");
	}
}

class Tiger extends Animal
{
	
	public void eat()
	{
		System.out.println("Tiger eats a lot");
	}
	
//	public void sleep()
//	{
//		System.out.println("Tiger sleeps a lot");
//	}
	
	public void run()
	{
		System.out.println("Tiger runs very fast");
	}
}

class Cub extends Tiger
{
	
}

