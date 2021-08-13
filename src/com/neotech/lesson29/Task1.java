package com.neotech.lesson29;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a map of a building. Store floor number and it is
		 * associated company name. (Example: 1=Google, 2=Apple,
		 * 3=Neotech etc..). Insert 7 entries with duplicate keys and values.
		 * 	Check how many entries you have?
		 * 	Update company on a 4th floor
		 * Remove company on the 7th floor
		 * Print your map
		 * 
		 */
		
		Map<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(2, "Neotech");
		building.put(4, "LinkedIn");
		building.put(5, "Facebook");
		building.put(6, "Microsoft");
		building.put(7, "IBM");
		
		System.out.println(building);
		
		System.out.println("How many entries do we have? "  + building.size());
		
		//update the 4th floor 
		System.out.println("Updating the company on the 4th floor:");
		building.replace(4, "Yahoo");
		
		System.out.println(building);
		
		//remove the 7th floor
		building.remove(7);
		System.out.println(building);
		
		
		
		
		
		
		
		
		
		

	}

}
