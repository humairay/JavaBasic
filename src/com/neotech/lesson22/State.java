package com.neotech.lesson22;

public class State {
	// instance variables
	String name, capital;

	// We don't have the default constructor anymore
	public State(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	public void displayName() {
		System.out.println(this.name);
	}

	public void displayCapital() {
		System.out.println(capital); // Compiler by default adds this keyword
	}

	public void displayFullInformation() {
		this.displayName();
		displayCapital(); // Compiler by default adds this keyword
		staticMethod(); // YES, I can call a static method
	}

	public static void staticMethod() {
		System.out.println("This is a static method");
		// displayCapital(); // I CANNOT call a non-static method from a static method
	}

	public static void main(String[] args) {
		State.staticMethod();

		State st = new State("NJ", "Trenton");
		st.displayFullInformation();

		System.out.println("--------------");

		State st2 = new State("NY", "Albany");
		st2.displayFullInformation();
	}
}
