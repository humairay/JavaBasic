package com.neotech.lesson23;

public class DegreeTest {

	public static void main(String[] args) {
// Call the method by creating an object of 
//		each of the three classes.

	Degree dg = new Degree();
	dg.getPrerequisite(); //calling method of Degree Class
	
	Bachelors bc = new Bachelors();
	bc.getPrerequisite();//calling method of Degree Class

	//this is where the overriding happens
	Masters ms = new Masters();
	ms.getPrerequisite();//calling method of Masters Class
		
		
	}

}
