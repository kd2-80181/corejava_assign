package com.sunbeam;

public class Manager implements Emp {

	private double base_salary ;
	private double dearance_allowance;
	
	public Manager() {
	}
	
	public Manager(double base_salary, double dearance_allowance) {
		super();
		this.base_salary = base_salary;
		this.dearance_allowance = dearance_allowance;
	}

	
	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_Salary(double base_salary) {
		this.base_salary = base_salary;
	}

	public double getDearance_allowance() {
		return dearance_allowance;
	}

	public void setDearancea_llowance(double dearanceallowance) {
		this.base_salary = dearance_allowance;
	}

	@Override
	public double getSal() {
		return this.base_salary + this.dearance_allowance;
	}
	
	@Override
	public double calcIncentives() {
		return 0.2*this.base_salary;
	}
}
