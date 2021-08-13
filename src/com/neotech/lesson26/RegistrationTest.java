package com.neotech.lesson26;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration r = new Registration();
		
		System.out.println("____Email____");
		r.setEmail("abc@abc.com");
		System.out.println(r.getEmail());
		
		
		r.setEmail("abc@yahoo.com");
		System.out.println(r.getEmail());
		
		System.out.println("___Username___");
		r.setUserName("Sabah");
		System.out.println(r.getUserName());
		
		r.setUserName("sabahbushaj");
		System.out.println(r.getUserName());
		
		
		System.out.println("___Password____");
		r.setPassword("12345");
		System.out.println(r.getPassword());
		
		r.setPassword("12345677");
		System.out.println(r.getPassword());
		
		r.setPassword("sabahbushaj1234");
		System.out.println(r.getPassword());
		
		
	}

}
