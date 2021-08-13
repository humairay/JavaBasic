package com.neotech.lesson24;

public class PhoneTest {

	public static void main(String[] args) {

//		Phone ph = new Phone();//CE: you cannot instantiate (create an instance of) an abstract class
		
		//we can indirectly create objects of abstract class by 
		//using upcasting
		Phone iphone  = new iPhone();
		
		//runtime polymorphism
		iphone.call();
		
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		
		Phone samsung = new Samsung();
		
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		//we cannot call the playGames() because it is not declared in Phone class
	//	samsung.playGames();
	
		//how do we call playGame()
		//1st
		Samsung sam = new Samsung();
		sam.playGames();
		
		//2nd
		//downcasting
		Samsung sm = (Samsung) samsung;
		sm.playGames();
	}

}
