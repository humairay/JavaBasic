package com.neotech.lesson14;

public class Car {

	
	//features of the class Car
	
	String make;
	String model;
	String color;
	int year;
//	int maxSpeed;
	
	
	void drive()
	{
		System.out.println("this car can drive");
	}
	
	
	void stop()
	{
		System.out.println(make + " can stop");
	}
	
	
	void transportPeople()
	{
		System.out.println(make + " " + model + " transports people");
	}
	
	
	
	
	
//	
//	// primitive data types: int, long, byte, short
//	// non-primitive data types: String, Car
//		
//		
//		public static void main(String[] args) {
//			
//			//declare int
//			int a = 5;
//			
//			// declare a string
//			String name = "Sabah";
//			
//			//another way to declare string
//			String name2 = new String("Mufasa");  // Scanner scan = new Scanner()
//			
//			//what does this line do?
//			Car car1 = new Car(); //creating an object of class Car
//			//1. declare an object of class Car ----> Car car1;
//			//2. instantiation   --->new
//			//3. Initialization ----> Car()
//			
//			
//			//car1 is an object of Car()
//			car1.make = "BMW";
//			car1.model = "X5";
//			car1.color = "Black";
//			car1.year = 2021;
//			
//			
//			
//			//car2 is an object of Car()
//			Car car2 = new Car();
//			car2.make = "Toyota";
//			car2.model = "Rav4";
//			car2.color = "White";
//			car2.year = 2021;
//			
//		}

}
