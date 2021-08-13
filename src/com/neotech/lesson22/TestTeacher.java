package com.neotech.lesson22;

public class TestTeacher {
	public static void main(String[] args) {
		
		Teacher t = new Teacher("Hakan", "Kurhan");
		MathTeacher mt = new MathTeacher("Enes", "Safran", "Calculus");
		ChemistryTeacher ct = new ChemistryTeacher("Komron", "Baba", "Chemistry");
		JavaTeacher jt = new JavaTeacher("Mufasa", "Simsek", true);
	
		t.teaching();
		System.out.println("----------------");
		jt.teaching();
		jt.teachingJava();
		System.out.println("----------------");
		ct.teaching();
		ct.teachingChemistry();
		System.out.println("----------------");
		mt.teaching();
		mt.teachingMath();
	}

}
