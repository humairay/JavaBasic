package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String language = "Java";
		// I love Java class!
		System.out.println("I love "+ language +" class!");
		
		String s1 = "I love ";
		String s2 = " class!";
		System.out.println(s1 + language + s2 );
		

		//spacing in strings
		System.out.println(                 "Spacing!!");
		System.out.println("                 Spacing!!");
		
		String s3 = "I have " + 2;
		String s4 = s3 + 4;
		
		System.out.println(s3);
		System.out.println(s4);
		
		String two = "2";
		String four = "4";
		int t = 2;
		int f = 4;
		//JAVA Knowledge: Strings are joined (concatenated) together, integers are added together
		System.out.println(two + four); //result "24"
		System.out.println(t + f);
		
		//order of operations in a string
		
		//order of reading	  1        2   3       4
		System.out.println("I have " + 2 + 4 + " apples!");
		//I have + 2 (String + int >> String) --> "I have 2"
		//"I have 2" + 4 (String + int >> String)--> "I have 24" ... apples!
		//order of reading     2          1        3
		System.out.println("I have "+ (2 + 4) +" apples!");
		
//		 2 + 2 * 3 =
//		(2 + 2) * 3 = 
		
	}
}
