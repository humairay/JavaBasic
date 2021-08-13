package com.neotech.lesson05;

public class NestedIf {

	
	public static void main(String[] args) {
		
//		if () //today is Weekday
//		{
//			if() //if the time is before 5 pm
//			{
//				//you are at work
//			}
//			else
//			{
//				//you are home
//			}
//		}
//		else //its a weekend
//		{
//			if()
//			{
//				
//			}
//			else
//			{
//				
//			}
//		}
		
		//when does this become a nested if
		 //--> when an if statement is coded inside another if block
		// --> when an if statement is coded inside the else block
		
	
		//Aim:
		//
		
		//if it morning  ---- say "good morning"
			//if it is a school  day  ----- "hangout with friends"
			//else (not a school day) ----- "hangout with family"
		//else    		----- say " its not morning"
		
		boolean isMorning = true;
		boolean schoolDay = true;
		
		
//		System.out.println(isMorning); ///true
//		System.out.println(5<6); // true
		
//		if(isMorning) if(5<6) --->> same thing but two different conditions
		
		if(isMorning)     // if isMorning is true then it checks inside the if block
		{
			System.out.println("Good Morning!");
			
			
			//this is the begining of the nested if-else statements
			if (schoolDay)
			{
				System.out.println("You are at school");
			}
			else //it is not a schoolDay
			{
				System.out.println("Hangout with family");
			}
			//this is the end of the nested if-else statements
			
		}
		else //it is not morning
		{
			System.out.println("It is not morning");
		}
	
	}
	
}
