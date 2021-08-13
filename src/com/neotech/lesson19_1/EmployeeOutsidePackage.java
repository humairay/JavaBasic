package com.neotech.lesson19_1;

//Import only Employee class from Package lesson19
//import com.neotech.lesson19.Employee;

//this imports all the classes on that specified package.
import com.neotech.lesson19.*;

public class EmployeeOutsidePackage {

	public static void main(String[] args) {
		Employee emp = new Employee();

		Employee.company = "Neotech"; //company has default access modifier
		emp.empName = "Komron";
	//	emp.empLastName = "";
	//	emp.salary = 80;
	//	emp.ssn = 12234;
		
		
		emp.method1(); //public
//		emp.method2(); //protected
//		emp.method3(); //default
//		emp.method4(); //private
	
	}

}
