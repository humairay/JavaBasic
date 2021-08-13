package com.neotech.lesson25;

public class DoctorTest {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		
		// What will be printed?
		doctor.setEmail("");
		System.out.println(doctor.getEmail());
		
		// What will be printed?
		doctor.setEmail("hakan@yahoo.com");
		System.out.println(doctor.getEmail());
		
		// What will be printed?
		doctor.setEmail("ozel@gmail.com");
		System.out.println(doctor.getEmail());
	}
}
