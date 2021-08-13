package com.neotech.lesson03;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		//arithmetic operators
		
		//declaring a set of same variables
		int num1, num2; // int num1; int num2;
		//initialize - give a value
		num1 = 25;
		num2 = 4;
		
		double d1, d2;
		d1 = 6.99;
		d2 = 3.5;
		
		
		int sum = 0;
		int mult = 0;
		int div = 0;
		
		sum = num1+num2;
		mult = num1*num2;
		div = num1/num2;
		
		System.out.println("The sum of the numbers is: "+ sum);
		System.out.println("The product of the numbers is: "+mult);
		System.out.println("The division of the numbers is: "+div);
		
		double div_d = 0;
		double div_i = 0;
		
		div_d = d1/d2;
		System.out.println("The division of the double numbers is: " + div_d);
		
		//not deciding on the right data types, you might loose information
		div_i = num1/num2;
		System.out.println("The division of the numbers is: "+ div_i);
		
		
	}
	
}
