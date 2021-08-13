package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		// String are immutable - not changeable!!!

		String str = "Hello";
		str.concat(" World");
		System.out.println(str);

		str.toUpperCase();
		System.out.println(str);

		str = str.toLowerCase();
		System.out.println(str);
	}

}
