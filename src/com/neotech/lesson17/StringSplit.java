package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {
		// split()
		String sentence = "Today is Thursday and I have Java class";
		String[] result = sentence.split(" ");

		for (String word : result) {
			System.out.print(word + "|");
		}
		System.out.println();

		// How many words are there in a sentence
		System.out.println("The sentence has " + result.length + " words");

		System.out.println("---------------");
		String[] array = sentence.split("d");
		for (String str : array) {
			System.out.println(str);
		}

		System.out.println("---------------");
		String combination = "ksshfdk9abcd3fghj2lmno";
		String[] arr = combination.split("[0-9]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---------------");
		// reverse the sentence
		// class|Java|have|I|and|Thursday|is|Today
		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i] + "|");
		}
	}
}
