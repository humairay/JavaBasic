package com.neotech.lesson25;

public abstract class Marks {
	public abstract double getAverage(); // un-implemented method
}

class StudentA extends Marks {
	double mark1, mark2, mark3;

	StudentA(double mark1, double mark2, double mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	@Override
	public double getAverage() {
		return (mark1 + mark2 + mark3) / 3;
	}
}

class StudentB extends Marks {
	double mark1, mark2, mark3, mark4;

	StudentB(double mark1, double mark2, double mark3, double mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	@Override
	public double getAverage() {
		return (mark1 + mark2 + mark3 + mark4) / 4;
	}
}
