package com.neotech.lesson18;

public class Homework2 {


	public static void main(String[] args) {
		/*
		 * Write a program to print out the following conversion:
		 * Today is Tuesday and we have a Java Class!!!  
		 * to 
		 * yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		 * 
		 * 
		 */
		
		String str = "Today is Saturday and we have a Java Class!!!";
		Homework2 h2 = new Homework2();
		
		// Steps: 
		
		// 1. make it possible to access each word by an index
		// 2. reverse each word and print
		
		String[] strArray = str.split(" ");
		
		
		
		
		for (String el : strArray)
		{
			//1st way:
	//		for(int i = el.length()-1; i >=0;i--)
	//		{
	//			System.out.print(el.charAt(i));
	//		}
	//		System.out.print(" ");
			
			
			//reverse the string
			//can we create a method that reverses it for us???
			String reversedStr = h2.reverseString(el);
			
			//print the string
			System.out.print(reversedStr + " ");
		}

		

		// convert this string the same way too
		
		String str2 = "Today is Saturday and its cool";
		//here we can use the method again
		//       ...
		//       ...
		
		
	}
	
//return type; name of the method;  parameters (String) 
	String reverseString(String str)
	{
		String resultStr = "";
		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1; i>=0; i--)
		{
			resultStr +=charArray[i];
		}
		
		//returning the result
		return resultStr;
	}
	

}
