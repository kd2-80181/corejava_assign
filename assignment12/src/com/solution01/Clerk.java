package com.solution01;

public class Clerk implements Emp {

	private double salary;

	@Override
	public double getSal() {
		return this.salary;
	}

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

}
