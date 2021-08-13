package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {

		// contains()
		String sentence = "Today is 4th of July";
		boolean contains = sentence.contains("today");
		System.out.println("contains -> " + contains);

		// startsWith()
		boolean starts = sentence.startsWith("Today");
		System.out.println("starts -> " + starts);

		// endsWith()
		boolean ends = sentence.endsWith("of July");
		System.out.println("ends -> " + ends);

		// equals()
		String str1 = "SATURDAY";
		String str2 = "saturday";

		boolean equals = str1.equals(str2);
		System.out.println("equals -> " + equals);

		// equalsIgnoreCase()
		boolean eq2 = str1.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase -> " + eq2);

	}
}
