package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Create a Set of cities in which you want to make sure that insertion order is maintained. 
		 * Using Iterator remove any city that starts with “A”;
		 * 
		 */
		
		Set<String> cities = new LinkedHashSet<>(); 
		
		cities.add("Garfield");
		cities.add("Clifton");
		cities.add("Albany");
		cities.add("Paramus");
		cities.add("ankara");
		cities.add("Annapolis");
		
		System.out.println("Set before removal: " + cities);
		
		//declare iterator
		Iterator<String> cityIt = cities.iterator();
		
		//iterate elements
		while(cityIt.hasNext())	
		{
			//remove city that starts with A or a
			
			
			//cityIt.next().toUpperCase().startsWith("A") 
			//1. get the item from the set using it.next()
			//2. convert the returned item to upper case
			//3. check if it starts with 'A'
			
			if(cityIt.next().toUpperCase().startsWith("A"))
			{
				cityIt.remove();
			}
			
			//2nd way
//			String city = cityIt.next();
			
//			if (city.toLowerCase().startsWith("a"))
//			{
//				cityIt.remove();
//			}
			
			//3rd 
//			if (city.toLowerCase().charAt(0) == 'a' )
//			{
//				cityIt.remove();
//			}
			
		}
		
		System.out.println("Set after removal: " + cities);
		
	}

}
