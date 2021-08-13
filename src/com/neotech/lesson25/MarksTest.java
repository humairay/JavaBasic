package com.neotech.lesson25;

public class MarksTest {

	public static void main(String[] args) {
		Marks st1 = new StudentA(90, 95, 98);
		Marks st2 = new StudentB(80, 92, 88, 94);
		
		System.out.println(st1.getAverage());
		System.out.println(st2.getAverage());
	}

}
