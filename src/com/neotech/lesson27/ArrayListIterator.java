package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		// int and double (primitive types) are not objects, that is why we need wrapper classes Integer and Double.

		
		ArrayList<String> choco = new ArrayList<>();
		choco.add("Kinder");
		choco.add("hershey");
		choco.add("godiva");
		choco.add("snickers");
		
		
		
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		
		sweets.addAll(choco); //by default, puts all objects of choco AL, at the end of the sweets AL
		
		
		System.out.println("The size of the sweets arrayList is: "+ sweets.size());
		System.out.println(sweets);
		
		
		//how do we use an iterator: 
		Iterator<String> it = sweets.iterator(); //import it from java.util.iterator
		
		//1 direction
		while(it.hasNext())
		{
			String str  = it.next();
			
			System.out.print(str + " - ");
			
			if (str.equals("ice cream"))
			{
				it.remove(); /// remove the current element from the collection
			}
		}
		
		System.out.println();
		System.out.println(sweets);
		
		//for loop
		//1 directions 
		for (String str : sweets)
		{
			System.out.print(str + " - ");
		}
		
		
		
		
		
		
		
	}

}
