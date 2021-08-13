package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Create a Set collection in which you need to add names of the countries. 
		 * In this set we want all objects to be sorted in alphabetical order. 
		 * Using 2 different ways retrieve all elements from set.
		 * 
		 */
		
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Turkiye");
		countries.add("Albania");
		countries.add("Italy");
		countries.add("Japan");
		countries.add("Iran");
		
		System.out.println(countries);
		
		
		//Using indexed For loop
		
		for(int i = 0; i< countries.size();i++)
		{
		//	countries.get(i); // in a set, we don't have indices
		}
		
		
		//Using enhanced For loop
		for (String country: countries)
		{
			System.out.println(country);
		}
		
		System.out.println("----------------------------------");
		
		//Using iterator
		Iterator<String> it = countries.iterator();
		
		
		while(it.hasNext())
		{
			//when the it.next() is called, the element is returned and the iterator moves to the next item
			String country = it.next();
			System.out.println(country);
			
	//		System.out.println("country 1 " + it.next());	
	//		System.out.println("country 2 " + it.next());
		}
		
		
		
		// on class request  - converting a set into a list
		System.out.println("Converting the Set into List and printing an element: ");
		List<String> al = new ArrayList<>();
		al.addAll(countries);
		System.out.println(al.get(0));

	}

}
