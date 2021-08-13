package com.neotech.lesson04;

public class RelationalEqualityOperators {

	public static void main(String[] args) {

		System.out.println(3 > 4);

		int a = 8; // assignment operator
		int b = 10;

		System.out.println(a > b); // false
		System.out.println(b > a); // true

		int c = 10;
		System.out.println(c > b); // false
		System.out.println(c == b); // is c equal to b? true
		System.out.println(c != b);// is c different from b? false

		System.out.println("******************");
		double d1 = 5.64;
		double d2 = 5.64;

		boolean result1 = d1 > d2; // is d1 greater than d2?
		System.out.println("The result1 is: " + result1);

		boolean result2 = (d1 == d2); // is d1 equal to d2?
		System.out.println("The result2 is: " + result2);

		boolean result3 = d1 < d2; // is d1 less than d2?
		System.out.println("The result3 is: " + result3);

		boolean result4 = d1 <= d2; // is d1 less or equal to d2?
		System.out.println("The result4 is: " + result4);

		boolean result5 = (d1 >= d2); // is d1 greater than or equal to d2?
		System.out.println("The result5 is: " + result5);
		
		// Break until 2:30

	}

}
