package com.neotech.lesson10;

public class PrintHours {

	public static void main(String[] args) {

		//print the whole combination of the digital clock
		//00:00  
		//00:01
		//....
		//12:00
		//....
		//23:59
		
		for(int hour = 0; hour < 24; hour++)
		{
			
			for(int min = 0; min < 60; min++)
			{
			//	System.out.println(hour + ":" + min);
				
				//formatting the output to 00:01
					//1. we need to take care of 0:0 ==> 00:00
					//2. what if we have 10:1  ==> 10:01
					//3. what if we have 1:10 ==> 01:10
					//4. what if we have 10:10
				
				if (hour < 10 && min < 10)
				{
					System.out.println("0" + hour + ":0" + min);
				}
				else if (hour>=10 && min < 10)
				{
					System.out.println(hour + ":0" + min);
				}
				else if (hour<10 && min >= 10)
				{
					System.out.println("0"+hour+":"+min);
				}
				else
				{
					System.out.println(hour+":"+min);
				}
				
			}
			
		}
		
		
	}

}
