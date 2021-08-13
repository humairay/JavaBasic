package com.neotech.lesson25;

public class Doctor {

	private String licenseId;
	private long phoneNr;
	private String email;

	public long getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(long phoneNr) {
		// You can add a logic to check it the number has 10 digits
		this.phoneNr = phoneNr;
	}

	// The getter method for Email
	public String getEmail() {
		return email;
	}

	// The setter method for Email
	public void setEmail(String email) {
		// We have some conditions
		if (!email.isEmpty()) {
			if (email.contains("gmail")) {
				this.email = email;
			} else {
				System.out.println("You have to use gmail!");
			}
		} else {
			System.out.println("The email cannot be empty!!!");
		}

	}
}
