package com.neotech.lesson29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {

		Set<String> st = new HashSet<>();
		st.add("Sabah");

		// key value
		HashMap<Integer, String> map = new HashMap<>();

		System.out.println("Size before adding: " + map.size());

		// for maps we do not use add(), we use put()
		map.put(0, "Hakan");
		map.put(10, "Komron");
		map.put(5, "Murat");
		map.put(25, "Flori");
		map.put(2, "Mufasa");

		// we can have multiple null values in the map
//		map.put(26, null);
//		map.put(27, null);

		// key can only have one default value

		System.out.println(map);

		boolean empty = map.isEmpty();
		System.out.println("is the map empty: " + empty);

		if (!empty) {
			System.out.println("the size after adding pairs is: " + map.size());
		}

		// map.put("1", "Ivonne"); //CE: key must be an integer

		// is it ok to have duplicate values
		map.put(7, "Flori");

		// what if we duplicate keys?? it will override the key-value pair that has the
		// same key
		map.put(7, "Murat");

		System.out.println(map);

		// how do we retrieve values from a map???

		String name = map.get(0);
		System.out.println("Name is: " + name);

		// how do we remove values???
		System.out.println("removing a pair");
		map.remove(7);
		System.out.println(map);

		// how do we replace a pair
		System.out.println("replacing  a pair");
		map.replace(2, "Sabah");
		System.out.println(map);

		// check if map contains a key??

		System.out.println("Does the map contain key 25? " + map.containsKey(25));

		System.out.println("Does the map contains value Sabah? " + map.containsValue("Sabah"));

	}

}
