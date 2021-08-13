package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		// I can store any type of Insurance
		ArrayList<Insurance> insuranceList = new ArrayList<>();

		insuranceList.add(new CarInsurance("Geico", "Honda")); // upcasting
		insuranceList.add(new PetInsurance("Cigna", "Dog"));
		insuranceList.add(new HealthInsurance("Aetna"));

		Iterator<Insurance> iterator = insuranceList.iterator();

		while (iterator.hasNext()) {
			Insurance ins = iterator.next();
			ins.getQuote();
			ins.cancelInsurance();

			System.out.println("-----------------------------");
		}

	}
}
