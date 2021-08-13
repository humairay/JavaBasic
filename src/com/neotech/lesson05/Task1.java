package com.neotech.lesson05;

public class Task1 {

	
	public static void main(String[] args) {
		
		/*
		 * Create a Java program to check if it is Friday or not. If it is Friday, print “It’s Friday. 
		 * I am going to watch a movie.” and check the date, if date is 13 print “I will watch a scary movie.”. 
		 * If date is not 13 print “I will watch a comedy.”. If it is not Friday, print “It is NOT Friday. 
		 * I am going to study JAVA.”
		 */
		
		//is it Friday  .... "Its Friday, I am going to watch a movie!"
			//if date is 13 ... "I will watch a scary movie!"
			//if the date is not 13 ..... "I will watch a comedy!"
		//if not Friday .... "Its not Friday, I am going to study Java."
		
		boolean isFriday = false;
		int date = 13;
		
		if(isFriday)
		{
			System.out.println("Its Friday, I am going to wath a movie!");
			
			//beginning nested if-else
			if(date == 13)
			{
				System.out.println("I will watch a scary movie!");
			}
			else
			{
				System.out.println("I will watch a comedy!");
			}
			//ending nested if-else
		}
		else
		{
			System.out.println("Its not Friday, I am going to study Java");
		}
		
	}
	
}
