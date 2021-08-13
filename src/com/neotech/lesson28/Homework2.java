package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		// Create an arrayList of even numbers from 1 to 50.
		// Using Iterator remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> numberColl = new ArrayList<>();

		// i = i + 2;
		for (int i = 0; i <= 50; i += 2) {
			numberColl.add(i);
		}

		System.out.println(numberColl);

		Iterator<Integer> it = numberColl.iterator(); // 3 methods -> next(); hasNext(); remove();

		while (it.hasNext()) { // if there is a next element, it is safe to get it!!!
			Integer number = it.next();

			if (number % 5 == 0) {
				it.remove();
			}

		}

		System.out.println(numberColl);

		// if you want to iterate the list again
		// you have to get another iterator
		Iterator<Integer> iterator2 = numberColl.iterator(); // this will give me another iterator
		while(iterator2.hasNext()) {
			System.out.print(iterator2.next() + "-");
		}
	}

}
