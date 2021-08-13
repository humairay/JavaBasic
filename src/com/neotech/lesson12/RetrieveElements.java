package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'F', 'D', 'C' };

		// 1st way, using for loop
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}

		System.out.println();

		// 2nd way, enhanced for loop / advanced for loop / for-each loop
		for (char element : grades) {
			System.out.print(element + ", ");
		}

		System.out.println();
		System.out.println("----------------------");
		String[] fruits = { "Apple", "Orange", "Plum", "Kiwi", "Passion fruit", "Cherry" };

		for (int i = 0; i < fruits.length; i++) {

			if (fruits[i].equals("Kiwi")) {
				System.out.println(fruits[i] + " is my favorite");
			} else {
				System.out.println(fruits[i]);
			}

		}

		System.out.println("----");

		for (String fruit : fruits) {

			if (fruit.equals("Kiwi")) {
				System.out.println(fruit + " is my favorite");
			} else {
				System.out.println(fruit);
			}

		}

	}
}
