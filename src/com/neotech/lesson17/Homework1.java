package com.neotech.lesson17;

public class Homework1 {
	// Create a String that will hold a sentence.
	// Write a program to get a new String without any spaces.

	public static void main(String[] args) {
		String str = "I thought we just went over it two days ago.";

		String str2 = str.replace(" ", "");

		System.out.println("old -> " + str);
		System.out.println("length is " + str.length());

		System.out.println("new -> " + str2);
		System.out.println("length is " + str2.length());

	}
}
