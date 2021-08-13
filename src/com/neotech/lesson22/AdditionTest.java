package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
		Addition obj = new Addition();

		obj.add(4, 5);
		obj.add(3, 5, 2);

		obj.add(2.3, 4.0);
		obj.add(1.5, 2.0, 3.1);

		obj.add(2.5, 2, 3);

		obj.add(2.3, 5);

		obj.add("Mufasa", 2);
		obj.add(2, "Mufasa");

	}

}
