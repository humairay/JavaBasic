package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {

		// When we want to change the string
		StringBuffer strBfr = new StringBuffer("Hello");
		System.out.println(strBfr);

		// here we show this is mutable -- changeable
		strBfr.append(" World"); // string is added to the existing object
		System.out.println(strBfr);

		String str = "Hi";
		str = str.concat(" All"); // A new string is created

		System.out.println(strBfr.length());
		System.out.println(strBfr.reverse());
		strBfr.reverse(); // We have reversed it again

		System.out.println("----------------");
		String anotherStr = strBfr.substring(3, 8);
		System.out.println(anotherStr);

		System.out.println("----------------");
		StringBuilder strBldr = new StringBuilder("We are tired");
		strBldr.append(", but we don't stop");
		System.out.println(strBldr);
	}

}
