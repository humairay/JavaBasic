package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat(); //create an instance/object of the Cat class!!!
		cat1.name = "Lucy"; 
		cat1.color = "White"; 
		cat1.age = 2;
		
		cat1.sayMeow();
		
		//lets create another cat
		Cat cat2 = new Cat();
		cat2.name = "Felicia";
		cat2.age = 3;
		cat2.color = "Brown";
		
		cat1.displayCatInfo();
		cat2.displayCatInfo();
		
		//we want to name Lucy to Tekir
		cat1.name = "Tekir";
		
		System.out.println(cat1.name + " " + cat1.color);
		System.out.println(cat2.name + " "+ cat2.color);
		
		cat1.displayCatInfo();
		cat2.displayCatInfo();
		
	}

}
