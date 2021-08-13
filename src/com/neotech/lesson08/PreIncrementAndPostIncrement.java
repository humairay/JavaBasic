package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	
	public static void main(String[] args) {
	
		
		
		/*		++ and --
		 * 		++ adds 1 to a variable  (INCREMENT)
		 * 		-- substacks 1 from variable (DECREMENT)
		 * 		you can use the before or after a variable
		 * 
		 */
		
		
		
		
		
		
		
		//declare x
		int x;
		//declare and initialize y
		int y = 10;
		
		
		//POST increment  - firstly use the variable, then increase it
		x = y++; // x is equal to y, then increment y by 1
		
		System.out.println(x);
		System.out.println(y);
		
		//PRE increment -- firstly increase the variable value, then use it in the operation
		
		int a;
		int b =15;
		
		a = ++b; // b is increased to 16 and then assigned to a
		
		System.out.println(a);
		System.out.println(b);
		
		//// pre-decrement and post decrement
		
		
		//PRE decrement --> first decrease the value of the variable, then use it
		int w;
		int z = 5;
		
		w = --z; // we are decreaseing z to 4 and then assigning it to w
		
		System.out.println(w);
		System.out.println(z);
		
		//POST decrement --> first use the variable and then decrease it by 1
		int c;
		int d = 7;
		
		
		c = d--; // we are assigning d to c and then we are reducing d by 1
		
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
	}
	
}
