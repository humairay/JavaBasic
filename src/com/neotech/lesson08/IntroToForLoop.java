package com.neotech.lesson08;

public class IntroToForLoop {

	
	public static void main(String[] args) {
		
		//print numbers from 1 to 10
		int a = 1;
		
		while(a<11)//also works the same if a<=10
		{
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		//USING A FOR LOOP
		
		
		//if you know how many times you need to loop/iterate, use for loop
		
			//initialization       condition		increment
		for (  int num = 1;         num<=10;           num++ ) //
		{
			System.out.print(num + " ");
			//no need to increment here
		}
		
		
	}
	
}
