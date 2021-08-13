package com.neotech.lesson03;

public class Task2 {

	/*
	 * Write a program to print the area and perimeter of a rectangle with width = 5 
	 * and height = 8. Your program should say. 
	 * “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and 
	 * the area is __”
	 * 
	 */

	
	public static void main(String[] args) {
		
		//declare variables: h and w;
		
		int h = 8;
		int w = 5;		
		
		//declare perimeter and area variables
		
		int p,a;
		//int p = 0;
		//int a = 0;
		
		// calculate perimeter
		p = 2*(h+w);	// h + h+ w+w // 2*h + 2*w	
		//calculate area
		a = h*w;
		
		//print the sentence
		
		System.out.println("The perimeter of the rectangle with width "+w+" "
				+ "and "+ "height "+h+" is equal to "+ p+ " and the area is "+a+".");
		
	}
	

	
	
}
