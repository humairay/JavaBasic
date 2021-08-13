package com.neotech.lesson14;

public class DogObjects {

	
	
	public static void main(String[] args) {
		
		//create object of Dog 
		Dog dog1 = new Dog(); //we create an instance of class Dog
		dog1.breed = "Shepherd";
		dog1.size = "Large";
		dog1.color = "Black";
		dog1.age = 2;
		
		dog1.run();
		dog1.name();
		
		
		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog2.size = "Small";
		dog2.age = 4;
		dog2.color = "Gray";
		
		dog2.sleep();
		dog2.eat();
		
		
	}
	
}
