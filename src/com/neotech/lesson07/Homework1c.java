package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1c {

	
	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and 
		 * print “The temperature is the city __ is __”
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String city; 
		int f; //temp in fahrenheit
		int c; //temp in celcius
		
		System.out.println("Where are you from?");
		city = scanner.next();
		System.out.println("What is the temperature?");
		f =scanner.nextInt();
		
		
		//convert Fahrenheit into celsius
		c = (f-32)*5/9;
		
		System.out.println("The temperature in the city of " + city + " is " + c);
		
		
		
		
	}
}
