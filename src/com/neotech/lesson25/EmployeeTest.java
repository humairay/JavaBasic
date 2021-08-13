package com.neotech.lesson25;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Flori");
		
		System.out.println(emp.getName());
		
		emp.setAge(20);
		System.out.println("The age of the employee is " +emp.getAge());
		
		emp.setSalary(95000);
		System.out.println(emp.getSalary());
		
	}

}
