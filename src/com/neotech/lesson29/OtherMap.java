package com.neotech.lesson29;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {

		//create a map with groceries 
		Map<String, Integer> groceries = new TreeMap<>(); //this map will be ordered alphabetically by the KEY
		
		groceries.put("Milk", 2);
		groceries.put("Bread", 4);
		groceries.put("Egg", 1);
		
//		groceries.put(3, "Oil"); //CE: the key must be a String
		
		groceries.put("Oil", 3);
		
		//we can override or replace
		groceries.replace("Egg", 2);
//		groceries.put("Egg", 2); 
		
		System.out.println(groceries);
		
		//get all the keys of the map and put them in a set
		Set<String> allKeys  = groceries.keySet();
		System.out.println("All keys of the map: " + allKeys);
		
		Collection<Integer> allValues = groceries.values();
		System.out.println("All values of the map: " + allValues);
		
	}

}
