package com.neotech.lesson28;

import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		// This is a HashSet, no duplicates, no order
		Set<String> veggies = new HashSet<>();
		veggies.add("patato");
		veggies.add("avocado");
		veggies.add("tomato");
		veggies.add("eggplant");
		veggies.add("patato");
		System.out.println(veggies);

		// This is a LinkedHashSet, no duplicates, insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Patato");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);

		// This is a TreeSet, no duplicates, alphabetical order
		Set<String> food = new TreeSet<>();
		food.add("patato");
		food.add("avocado");
		food.add("tomato");
		food.add("eggplant");
		food.add("patato");
		System.out.println(food);
	}

}
