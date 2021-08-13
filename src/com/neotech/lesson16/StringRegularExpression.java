package com.neotech.lesson16;

public class StringRegularExpression {

	public static void main(String[] args) {
		String greeting = "Good morning";

		// replace()
		String newGreet = greeting.replace('o', 'u');
		System.out.println(newGreet);

		String otherGreet = greeting.replace("morning", "afternoon");
		System.out.println(otherGreet);

		String lastGreet = greeting.replace("evening", "afternoon");
		System.out.println(lastGreet);

		// replaceAll()
		String combination = "My phone # is 328-754-9327";
		System.out.println(combination);

		String newcombination = combination.replaceAll("[0-9]", "*");
		System.out.println(newcombination);

		String hakanIsTheBest = combination.replaceAll("[a-z]", "+");
		System.out.println(hakanIsTheBest);

		String evisIsTheBest = combination.replaceAll("[A-Z]", "+");
		System.out.println(evisIsTheBest);

		String komronIsTheBest = combination.replaceAll("[^0-9]", "+");
		System.out.println(komronIsTheBest);

		String ivonneIsTheBest = combination.replaceAll("[0-9a-zA-Z]", " ");
		System.out.println(ivonneIsTheBest);
		
		String muratIsTheBest = combination.replaceAll("[^0-9a-zA-Z]", "=");
		System.out.println(muratIsTheBest);
	}
}
