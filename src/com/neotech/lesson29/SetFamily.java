package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		
		//no duplicates, no order
		Set<String> veggies = new HashSet<>();
		veggies.add("potato");
		veggies.add("tomato");
		veggies.add("cucumber");
		veggies.add("potato");

		System.out.println(veggies);
		
		
		
		//no duplicates, insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		
		System.out.println(fruits);
		
		
		//no duplicates, natural order 
		Set<String> food = new TreeSet<>();
		food.add("pizza");
		// add all items of the sets above in the TreeSet
		food.addAll(veggies);
		food.addAll(fruits);
		
		
		System.out.println(food);
		
	}

}
