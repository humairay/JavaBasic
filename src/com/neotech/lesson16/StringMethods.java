package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {
		// 1st way of creating a string
		String name = "Enes"; // String literal

		// 2nd way
		String name2 = new String("Hakan");
		System.out.println(name2);

		// length()
		String school = "Neotech Academy";
		int size = school.length();
		System.out.println("The size of " + school + " is " + size);

		String school2 = "     Neotech Academy     ";
		int size2 = school2.length();
		System.out.println("The size of " + school2 + " is " + size2);

		// toUpperCase() toLowerCase()
		String city = "FairFax";
		String newCity = city.toLowerCase();
		System.out.println(newCity);

		System.out.println(city.toUpperCase());

		// concat()
		// This is a concatenation
		String sentence = "The size of " + school + " is " + size;

		String zip = "12345";

		String sentence3 = city + zip;
		System.out.println(sentence3);

		String sentence2 = city.concat(zip);
		System.out.println(sentence2);

		String sentence4 = city + " " + zip;
		System.out.println(sentence4);

		String sentence5 = city.concat(" ").concat(zip); // method chaining
		System.out.println(sentence5);

		String sentence6 = city.concat(", ").concat("VA").concat(" ").concat(zip);
		System.out.println(sentence6);

		// isEmpty()
		String str = " "; // space is a character
		boolean isEmp = str.isEmpty();
		System.out.println(isEmp);

		// trim()
		System.out.println(school2);
		System.out.println(school2.trim());

		String sent = "   I woke up      very late  today!   ";
		System.out.println(sent.trim());

		String sent2 = "    I love    my students!   ";
		int size5 = sent2.length();
		System.out.println(size5);

		String sent3 = sent2.trim();
		int size6 = sent3.length();
		System.out.println(size6);

		// This is for Komron
		int[] num = { 5, 4, 1, 7, 8 };
		int size7 = num.length; // in this case length is a property, not a method

		int size8 = sent3.length(); // in this case length() is a method
	}
}
