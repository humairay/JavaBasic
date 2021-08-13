package com.neotech.lesson16;

import java.util.Scanner;

public class StringMoreMethods {

	public static void main(String[] args) {
		// charAt()
//		Scanner scan = new Scanner(System.in);
//		char letter = scan.next().charAt(2);
//		System.out.println(letter);

		String name = "Hakan";
		char oneLetter = name.charAt(0);
		System.out.println(oneLetter);

		// indexOf()
		int index = name.indexOf('a');
		System.out.println("index is " + index);

		// substring()
		String message = "Komron is the best";
		String substr = message.substring(10); // only one parameter, beginIndex
		System.out.println(substr);

		String substr2 = message.substring(3, 9); // two parameters, beginIndex and endIndex
		System.out.println(substr2);
	}

}
