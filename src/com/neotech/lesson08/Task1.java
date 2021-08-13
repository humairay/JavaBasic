package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 - As long as it is workDay print “I need a day off” and
		 * increase day. - Once day is 6 print “I do not need a day off any more”
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay) // day < 7
		{
			if (day < 6) // if day is 1 to 5
			{
				System.out.println("I need a day off!!!");
			} else {
				System.out.println("I do not need a day off anymore!!!");
				workDay = false;
			}

			day++;

		}

	}

}
