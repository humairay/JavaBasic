package com.neotech.lesson09;

public class Homework1 {
	public static void main(String[] args) {
		// 1. Write a program using while loop
		// that calculates the sum of the even numbers between 0 and 10.

		// 1st way, increment by 1
		int i = 0;
		int sum = 0;

		while (i <= 10) {
			if (i % 2 == 0) { // even
				sum += i;
			}
			i++;
		}

		System.out.println("sum = " + sum);

		System.out.println("---------------------");

		// 2nd way, increment by 2
		int j = 0;
		int total = 0;
		while (j <= 10) {
			total += j;
			j += 2;
		}

		System.out.println("total = " + total);

	}
}
