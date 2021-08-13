package com.neotech.lesson06;

public class Homework1 {
	
	//We chose this homework using nested if

	public static void main(String[] args) {
		// Write a java program to check if a patient has allergies.
		// If the patient does not have allergies print “You’re healthy!”.
		// If the patient has allergies,
		// check if it is a peanut allergy,
		// lactose allergy, bee allergy or seafood allergy
		// and print a statement telling the patient “Don’t eat ___”.
		// (fill the line with the food names – peanut, seafood etc.)

		boolean allergy = false;
		boolean peanut = true;
		boolean bee = true;
		boolean seafood = true;
		boolean lactose = true;

		// Format the code
		// MAC --> cmd + shift + f
		// Windows --> ctrl + shift + f

		if (allergy) {
			System.out.println("You have allergy");

			if (peanut) {
				System.out.println("Don't eat peanut!");
			} else {
				System.out.println("You can eat peanut!");
			}

			if (bee) {
				System.out.println("Don't eat honey!");
			}

			if (seafood) {
				System.out.println("Don't eat seafood!");
			}

			if (lactose) {
				System.out.println("Don't drink milk!");
			}

		} else {

			System.out.println("You’re healthy!");

		}

	}

}
