package com.neotech.lesson26;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {

/*
 * 
 * Create a generic ArrayList that will store 5 names into it.
 * 		Find out whether the given ArrayList is empty or not?
 * 		Check whether the specific name is present in an ArrayList or not?
 * 		Find the size of your arrayList and print all values from that
 * 
 * 
 */
		
		//ArrayList of String objects
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Mufasa");
		names.add("Erdogan");
		names.add("Sabah");
		names.add("Humaira");
		names.add("Atoullo");
		
		System.out.println("Is the list empty?? " + names.isEmpty());
		System.out.println("Does it contain the name Mufasa?? " + names.contains("Mufasa"));
		System.out.println("The size of the ArrayList is: " + names.size());
		System.out.println(names);
		
		
		
		
		
	}

}
