package com.neotech.lesson18;

public class Homework1 {

	public static void main(String[] args) {

		/*
		 * Create a String and print it in reverse order (Sunday -> yadnuS). 
		 * Solve it using charAt(), toCharArray()  and reverse() methods.
		 * Note:
		 * for charAt() and toCharArray() use String
		 * for reverse you have to declare a StringBuffer object
		 * 
		 * 
		 */
		
	//	int[] x = {5,6}; 
		String str = "Sunday";
		
	//	str.charAt(2);
		
		
		//1st way: using charAt() and decrementing
		
		for(int i = str.length()-1; i >=0; i--)
		{
			//this stores the character in a variable and then prints it.
		//	char c = str.charAt(i);
		//	System.out.print(c);
			
			//in one step.
			System.out.print(str.charAt(i));
		}
		
		//how to find the difference between two java methods???
		str.length();
	//	x.length;
		
		
		
		System.out.println();
		//2nd way
		char[] str_chars = str.toCharArray();
	//	str_chars[2];
		
		for (int i = str_chars.length-1; i >=0;i--)
		{
			// two steps
//			char a = str_chars[i];
//			System.out.print(a);
			
			//one step
			System.out.print(str_chars[i]);	
		}
		
		System.out.println();
		
		// using reverse() from StringBuffer 
		StringBuffer strBuff = new StringBuffer(str);
		strBuff.reverse();
		System.out.println(strBuff);
		
		
		
	}

}
