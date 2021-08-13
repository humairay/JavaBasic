package com.neotech.lesson19;

 public class Employee {

	
	public static String company; //since no access modifier is written, this is default
	
	public String empName;
	protected String empLastName;
	
	double salary;  //if no access modifier is defined in front of the variable/method, then its default
	//	OPTIONAL	   	MUST MUST
	//access modifier    type name
	private int ssn;
	
	// 		OPT
	//access modifier
	public void method1()
	{
		System.out.println("I am a public method!!");
	}
	
	protected void method2()
	{
		System.out.println("I am a protected method!!");
	}
	
	void method3()
	{
		System.out.println("I am a default method!!");
	}
	private void method4()
	{
		System.out.println("I am a private method!!!");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		company = "Neotech";
		emp.empName = "Sabah";
		emp.empLastName = "Bushaj";
		emp.salary = 60;
		emp.ssn = 123456;
		
		//can we access the methods 
		
		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
		
		
	}
	
}
