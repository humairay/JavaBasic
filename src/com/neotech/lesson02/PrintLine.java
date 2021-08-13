package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {

		System.out.println("Good Evening!");

		System.out.println("How are you doing?");

		// println - prints then moves to the new line
		// print - prints then DOES NOT move to the new line

		System.out.print("1"); // After 1 has been printed, it will stay at the same line
		System.out.print("2");
		System.out.print("3");
		System.out.println("4"); // After 4 has been printed, it will move to the new line
		System.out.println("5");
		System.out.println("6");

		// \n --> will move to the new line
		System.out.println("Do you have any questions? \n Or should I continue?");

	}

}
