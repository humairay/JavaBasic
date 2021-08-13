package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {

	private String name; 
	private int studentID;
	
	Student(String name, int studentID)
	{
		this.name = name;
		this.studentID = studentID;
	}
	
	public void printName()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		/*
		 * Create a Set collection that will hold Objects of Student Type. 
		 * In this set we do not care about the insertion order. 
		 * Each student object should have name and studentID. Display name of each student.
		 * 
		 */
		
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("Flori", 1));
		students.add(new Student("Murat", 2));
		students.add(new Student("Sabah", 3));
		students.add(new Student("Mufasa",4));
		
		
		System.out.println("Size of the set before removal: " + students.size());
		
		Iterator<Student> studentIt = students.iterator();
		
		while(studentIt.hasNext())
		{
			//one-liner
		//	studentIt.next().printName();
			
			//2nd way
			Student s = studentIt.next();
			s.printName();
			
			
			//how to remove an object from the Set
			if(s.name.equalsIgnoreCase("flori"))
			{
				studentIt.remove();
			}
			
			
		}
		
		System.out.println("Size of the set after removal: " + students.size());
		
		
	}

}
