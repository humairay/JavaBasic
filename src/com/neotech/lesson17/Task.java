package com.neotech.lesson17;

public class Task {
	// Find out how many sentences are there in the string
	// "Yay! It is Saturday. Is it raining? Take your umbrella."

	// If it difficult, try to use this String
	// "Yay. It is Saturday. Is it raining. Take your umbrella."

	public static void main(String[] args) {

		String str = "Yay! It is Saturday. Is it raining? Take your umbrella.";
		String[] sentences = str.split("[.!?]");

		for (String s : sentences) {
			System.out.println(s);
		}

		System.out.println("There are " + sentences.length + " sentences");

		System.out.println("==================");
		// If I want to print "Maryam"
		// Inside the string, some character have a special meaning in Java,
		// When we want to use use them, we may get an error
		// " \ ? n t These have special meaning in Java
		System.out.println("\"Maryam\""); // '\' is called escape character
		System.out.println("\\Maryam\\");

		// ? . * have a special meaning in regular expression
		String s = "abc abbc afc afgc";
		String s2 = s.replaceAll("[a?c]", "+");
		System.out.println(s2);

		String str2 = "Yay? It is Saturday? Is it raining? Take your umbrella?";
		String[] array = str2.split("\\?");
		System.out.println("Array length is " + array.length);

	}
}
