package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		// CTRL + SHIFT + O
		Scanner scan = new Scanner(System.in);

		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRaining;
		char gender;

		/*
		 * System.out.println("Input a line of text: "); // today is cloudy!!! text1 =
		 * scan.next(); //from the start of the sentence to the first space encountered
		 * System.out.println(text1); text2 = scan.next(); System.out.println(text2);
		 * text3 = scan.nextLine(); // from the point you are starting get everything
		 * until the end of line System.out.println(text3);
		 * 
		 * //next() vs nextLine()
		 * 
		 * 
		 * System.out.println("What is your age??"); age = scan.nextInt();
		 * System.out.println(age); year = scan.nextInt(); System.out.println(year);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("What is your salary?"); salary = scan.nextDouble();
		 * System.out.println("The salary is " + salary);
		 * 
		 * 
		 * 
		 * System.out.println("Is it raining?"); isRaining = scan.nextBoolean();
		 * System.out.println(isRaining);
		 * 
		 

		System.out.println("What is your gender (M or F): ");
//identifier| assignment operator |scan |next() gets input from the start until the first space | charAt()

		gender = scan.next().charAt(0);

// 		line 54 is equivalent to these two lines below
//		text1 = scan.next();
//		gender = text1.charAt(0);

		System.out.println(gender);
		
		*/
		
		

		System.out.println("Enter your name, age, gender and salary: ");
		text1 = scan.next();
		age = scan.nextInt();
		gender = scan.next().charAt(0);
		salary = scan.nextDouble();
		
		System.out.println("Your info is: " + text1+ " " + age+ " "+ gender + " "+ salary);
		
		
		
		
		
	}
}
