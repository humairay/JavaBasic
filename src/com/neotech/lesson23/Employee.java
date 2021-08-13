package com.neotech.lesson23;

public class Employee {
	double salary;
	
	//this meethod calculates salary
	void getPaid() //this method is overriden 
	{
		System.out.println("The employee salary is " + salary);
	}

}

class Contractor extends Employee
{
	double hourlyRate;
	
	
	void getPaid()//this method overrides the parent getPaid() method
	{
		System.out.println("The contractor hourly rate is " + hourlyRate);
	}
	
}

class FullTimeEmployee extends Employee
{
	
}




