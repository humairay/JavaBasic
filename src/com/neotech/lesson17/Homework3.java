package com.neotech.lesson17;

import java.util.Scanner;

public class Homework3 {
//    Write a program that reads two parent's first names and if they expecting boy or girl?
//    Based on the input suggests a name for a baby:
//    If it is a boy get half from dad and half from mom.
//    If it is a girl get half from mom and half from dad.
//
//        Example Output:
//            Mom's first name? Mary
//            Dad's first name? Daniel
//            Boy or Girl? boy
//            Suggested baby name: DANRY
//        Example Output:
//            Mom's first name? Mary
//            Dad's first name? Daniel
//            Boy or Girl? girl
//            Suggested baby name: MAIEL

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the father's name!");
		String fName = input.nextLine();
		System.out.println("Please enter the mother's name!");
		String mName = input.nextLine();
		System.out.println("Are you expecting a boy or a girl?");
		String baby = input.nextLine();

//		String babyName = "";
//		if (baby.equals("boy")) {
//			System.out.println("Yay, it's a boy!");
//			babyName = fName.substring(0, fName.length() / 2).concat(mName.substring(mName.length() / 2));
//		} else if (baby.equals("girl")) {
//			System.out.println("Oh no, it's a girl!");
//			babyName = mName.substring(0, mName.length() / 2).concat(fName.substring(fName.length() / 2));
//		} else {
//			System.out.println("Wrong Entry");
//		}
//		
//		System.out.println("The name of the baby is " + babyName.toUpperCase());

		// 2nd way
		if (baby.equalsIgnoreCase("boy")) {
			String fatherFirstHalf = fName.substring(0, fName.length() / 2);
			String motherSecondHalf = mName.substring(mName.length() / 2);
			String babyName = fatherFirstHalf.concat(motherSecondHalf);
			System.out.println(babyName.toUpperCase());
		} else if (baby.equalsIgnoreCase("girl")) {
			String motherFirstHalf = mName.substring(0, mName.length() / 2);
			String fatherSecondHalf = fName.substring(fName.length() / 2);
			String babyName = motherFirstHalf.concat(fatherSecondHalf);
			System.out.println(babyName.toUpperCase());
		} else {
			System.out.println("Wrong Entry");
		}

	}
}
