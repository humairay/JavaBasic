package com.neotech.lesson04;

public class CompoundOperator {
	// Also known as (aka) shorthand operator

	public static void main(String[] args) {
		int num = 100; // create a box and store 100
		num = num + 100; // add 100 to the value inside the box
		System.out.println(num);// 200

		num = num + 100;
		System.out.println(num); // 300

		// We can use compound/shorthand operators which are shorter
		num += 100;
		System.out.println(num); // It was 300, then it became 400

		// long way
		// num = num - 50;

		// short way
		num -= 50; // it was 400, then it became 350
		System.out.println(num); // 350

		// num = num / 7;
		num /= 7;
		System.out.println("After dividing by 7 --> " + num); // 50

		// num = num * 2;
		num *= 2; // will multiply by 2 the and store it in the same variable/box
		System.out.println("After multipying by 2 --> " + num); // 100

		// num = num % 9;
		num %= 9; // store the remainder in the same variable
		// 100 / 9 = 11; 11 * 9 = 99; 100 - 99 = 1; This is the remainder
		// Alb -> Mbetja
		// Tur -> Kalan
		// Rus -> ostatok
		// Spa -> El resto
		System.out.println("After modulus by 9 -->" + num);

	}

}
