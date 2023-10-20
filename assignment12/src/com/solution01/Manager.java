package com.solution01;

public class Manager implements Emp {
	
	private double basicSalary;
	private double dearanceAllowance;
	
	@Override
	public double getSal()
	{
		return (basicSalary+dearanceAllowance);
	}

	@Override
	public double calcIncentives() {
		return 0.02*this.basicSalary;
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
	
}
