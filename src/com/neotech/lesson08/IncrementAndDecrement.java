package com.neotech.lesson08;

public class IncrementAndDecrement {

	
	public static void main(String[] args) {
		
		int x = 10;   // we add 10 oranges in box x
		
		x = x + 1;      // in the same box x we add one more orange
		//as shortcut
		x += 1;  //shorthand operator			
		//increment 
		x++;   //same as x = x + 1
		
		System.out.println(x);
		
		
		//decrement
		int y = 15;  // we have 15 apples in a box y
		
		y = y - 1;  // eat one
		
		//shorthand operator
		y -= 1;
		
		//decrement
		y--;
		
		System.out.println(y);
		
	}
}
