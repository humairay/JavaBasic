package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String[] countries = { "Mexico", "Turkey", "Tajikistan", "Uzbekistan" };

		// 1st way
		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("Tajikistan")) {
				System.out.println("Dushanbe");
			} else if (countries[i].equals("Mexico")) {
				System.out.println("Mecixo City");
			} else if (countries[i].equals("Uzbekistan")) {
				System.out.println("Tashkent");
			} else if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			}

		}
		
		System.out.println("---------");
		
		// 2nd way
		for (String country : countries) {

			if (country.equals("Tajikistan")) {
				System.out.println("Dushanbe");
			} else if (country.equals("Mexico")) {
				System.out.println("Mecixo City");
			} else if (country.equals("Uzbekistan")) {
				System.out.println("Tashkent");
			} else if (country.equals("Turkey")) {
				System.out.println("Ankara");
			}

		}
	}
}
