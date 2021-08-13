package com.neotech.lesson07;

public class IntroToSwitch {

	
	public static void main(String[] args) {
		
		
		//given the number 1-7, print out the name of the day
		
		int day = 2;
		String dayName;
		
		/////USING IF CONDITIONS
		
		if (day==1)
		{
//			System.out.println("Monday");
			dayName = "Monday";
		}
		else if(day ==2)
		{
//			System.out.println("Tuesday");
			dayName = "Tuesday";
		}
		else if(day ==3)
		{
//			System.out.println("Wednesday");
			dayName = "Wednesday";
		}
		else if (day == 4)
		{
//			System.out.println("Thursday");
			dayName = "Thursday";
		}
		else if (day == 5)
		{
//			System.out.println("Friday");
			dayName = "Friday";
		}
		else if (day == 6)
		{
//			System.out.println("Saturday");
			dayName = "Saturday";
		}
		else if (day == 7)
		{
//			System.out.println("Sunday");
			dayName = "Sunday";
		}
		else
		{
//			System.out.println("That is not a day");
			dayName = "Invalid";
		}
		
		System.out.println("The name of the day with number " + day + " is " + dayName);
		
		///////USING SWITCH CASE
		
		switch(day)
		{
		case 1: // if (day == 1)
//			System.out.println("Monday");
			dayName = "Monday";
			break; // ends the execution of the block

		case 2: // if (day == 2)
//			System.out.println("Tuesday");
			dayName = "Tuesday";
			break;
		case 3: 
//			System.out.println("Wednesday");	
			dayName ="Wednesday";
			break;	
		case 4: 
//			System.out.println("Thursday");
			dayName = "Thursday";
			break;
		case 5: 
//			System.out.println("Friday");
			dayName = "Friday";
			break;
		case 6: 
//			System.out.println("Saturday");
			dayName = "Saturday";
			break;
		case 7:
//			System.out.println("Sunday");
			dayName = "Sunday";
			break;
		default:  //same as else block
//			System.out.println("Invalid input");
			dayName = "Invalid";
			break;
		}
		
		System.out.println("The name of the day with number " + day + " is " + dayName);
		
	}
	
}
