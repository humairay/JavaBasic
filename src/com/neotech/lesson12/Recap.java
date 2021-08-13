package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		int[] grades = new int[5]; // default value for integers is 0

		int size = grades.length;

		System.out.println("The size of the array is " + size);

		System.out.println("Grade with index 2 is -> " + grades[2]);

		grades[3] = 90;
		grades[1] = 85;
		// grades[5] = 100; // run-time error
		// grades[2] = "Three"; // compile-time error
		grades[2] = 87;
		grades[0] = 100;
		grades[4] = 93;

		// re-assign a value to the element with index 3
		grades[3] = 99;

		size = grades.length;
		System.out.println("The size of the array after entering some values " + size);

		int grade = grades[2];
		System.out.println("Grade with index 2 is -> " + grades[2]);

		System.out.println("--- Let's find the average of the class ---");

		// 1st way, silly way
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		System.out.println("Total of grades is " + total);

		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
		System.out.println("The average is " + average);

		// 2nd way, using a for loop
		int sum = 0;
		for (int index = 0; index < size; index++) {
			sum += grades[index];
		}
		System.out.println("The average is " + sum / size);

		System.out.println("------------------------------");
		String[] cities = { "Tirana", "Ankara", "Dushanbe", "Mexico City", "Moscow" };
		System.out.println(cities[3]);

		System.out.println("The length of the array is " + cities.length);

		int length = cities.length;
		System.out.println("The last city in the array is " + cities[length - 1]);

		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		System.out.println("------------------------------");
		System.out.println("Let me print cities in reverse order!");

		for (int i = cities.length - 1; i >= 0; i--) {
			System.out.println(cities[i]);
		}
	}
}
