package com.neotech.lesson21;

public class Dog extends Animal{

	//specific feature of the dog
	String breed;
	
	
	//specific behaviour of the dog
	
	public void bark()
	{
		System.out.println("The dog barks!!!");
	}
	
	
	
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();
	}
	
}
