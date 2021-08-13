package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.age = 5; 
		a.color = "Black";
		a.size = "Big";
		
		a.eat();
		a.sleep();
		a.displayInfo();
		
		//when creating a an object of the parent class
		//we do not have access to the child class features and behaviors
//		a.breed = "";
//		a.bark();

		System.out.println("-----------------");
	
		Dog d = new Dog();
		d.age = 3;
		d.color = "Gray";
		d.size = "Medium";
		//dog has extra features of its own
		d.breed = "Husky";
		
		d.eat();
		d.sleep();
		d.displayInfo();
		//dog has extra behaviors 
		d.bark();
		
		System.out.println("------------");
		
		Puppy p = new Puppy();
		//features coming from the Animal class
		p.age = 1;
		p.color = "White";
		p.size = "Small";
		//feature coming from the Dog class
		p.breed = "Bulldog";
		
		p.eat();
		p.sleep();
		p.displayInfo();
		
		p.bark();
		
		System.out.println("--------");
	
		Cat c = new Cat();
		c.age = 3;
		c.color="white";
		c.size = "small";
		
		//we do not have access to the features and behaviors of the Dog class
	//	c.breed ="";
		
		
		
		
		
	}

}
