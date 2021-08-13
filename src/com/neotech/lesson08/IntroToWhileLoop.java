package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		int time = 8;

//			if(time < 9) 
//			{
//				System.out.println("Good morning");
//			}

		// IF A LOOP EXECUTES ALWAYS --> INFINITE LOOP

		while (time < 12)// here we write the condition)
		{// begins the while block

			// this code is only executed if the condition is true

			System.out.println("Time is: " + time);

			// time = time + 1;
			// time +=1;
			time++;

			// System.out.println("this line is executed");

		} // ends the while block

		
		
		//Print numbers from 1 to 50
		int num1=1;
		
		//we want to print 1 2 3 .... 50 --> we want to increase each time by 1
		
		//loop - iteration: one run of the while block 
		
		while(num1<=50) //if num1 is less than or equal to 50 this loop will START running 
		{
			System.out.println(num1); //print number
			num1++; 				//increment the number
			
			
			//go check the condition again
		}
		
		
		//how to print numbers from 20 to 30
		
		int num2 = 20;
		
		while(num2 < 30)//30 not included
		{
			System.out.print(num2 + " ");
			num2++;
			
		}
		
		
		
		
	}

}
