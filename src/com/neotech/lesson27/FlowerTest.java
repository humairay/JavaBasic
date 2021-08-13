package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {


		Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new SunFlower("Sunflower")};
		
		//cannot add more
//		flowerArray[3] = new Rose("Rose"); //IndexOutOfBoundEx.

		// 1st difference: array have fixed size
		
		//can we access them by index ?? Yes
		//can we access them using enhanced for loop? Yes
		
		
		
		ArrayList<Flower> flowerArrayList = new ArrayList<>();
		
		flowerArrayList.add(new Rose("Rose"));
		flowerArrayList.add(new Tulip("Tulip"));
		flowerArrayList.add(new SunFlower("Sunflower"));
		
		
		//can we access them by index ?? Yes
		//can we access them using enhanced for loop? Yes
		//can we access them using an iterator ? Yes
		
		
		//using for loop:
		//2 directions
		for (int i = 0; i < flowerArrayList.size(); i++) //a benefit of this is that we can also go from the last to the first
		{
			//1st way
			flowerArrayList.get(i).bloom();
			//2nd way
//			Flower f = flowerArrayList.get(i);
//			f.bloom();
		}
		
		
		//using enhanced for loop:
		//1 direction
		for (Flower f: flowerArrayList)
		{
			f.bloom();
		}
		
		
		//using iterator
		//1 direction
		Iterator<Flower> it = flowerArrayList.iterator();
		
		
		while(it.hasNext())
		{
			//1st way
			it.next().bloom();
			//2nd way
//			Flower f = it.next();
//			f.bloom();
		}
		
		
		
		
		
	}

}
