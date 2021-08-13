package com.neotech.lesson20;

public class ThisKeywordTest {

	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(10, 20);
		obj1.sum();
		
		// this is how I access variable a from outside
		// obj1.a;

		ThisKeyword obj2 = new ThisKeyword(5, 6);
		obj2.sum();
	}
}
