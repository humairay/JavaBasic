package com.neotech.lesson16;

public class Homework1 {
	// Create a method createEmail(). Based on provided users firstName, lastName
	// and emailType, your method should return complete email address.
	// Example:
	// firstName -> john
	// lastName -> snow
	// emailType -> gmail
	// return -> johnsnow@gmail.com

	String createEmail(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + "@" + emailType + ".com";
		return email;
	}

}
