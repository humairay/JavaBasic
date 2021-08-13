package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndCase {

	
	public static void main(String[] args) {
		
		
		/*
		 * Ask user to enter their country (“Albania”, “Turkiye”,”USA”) and capture it. 
		 * Once values are captured print which language (“Albanian”, “Turkish”, “English”) user speaks.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		String country;
		
		
		System.out.println("What is your country?");
		country = scan.next();
		
		if (country.equals("Albania")) //checking if country == "Albania"
		{
			System.out.println("You speak Albanian");
		}
		else if (country.equals("USA") || country.equals("UK"))
		{
			System.out.println("You speak English");
		}
		else if (country.equals("Turkiye"))
		{
			System.out.println("you speak Turkish");
		}
		else
		{
			System.out.println("I dont know what language you speak!");
		}
		
		////USING SWITCH CASE////////
		
		
		switch(country)
		{
		case "Albania":
			System.out.println("You speak Albanian");
			break;
		case "UK":
		case "Australia":
		case "USA":
			System.out.println("You speak Enlgish");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		default:
			System.out.println("I dont know what language you speak!");
			break;
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
}
