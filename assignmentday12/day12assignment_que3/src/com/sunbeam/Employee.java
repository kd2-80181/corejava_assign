package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter the Employee Id :");
		this.empid = sc.nextInt();
		System.out.println("Enter the Employee Name : ");
		sc.nextLine();
		this.name = sc.nextLine();
		System.out.println("Enter theEmployee Salary : ");
		this.salary = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Employee [ Empid: "+this.empid+", Empname: "+this.name+", Salary: "+this.salary+" ]"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(this.getEmpid() == other.getEmpid())
				return true;
		}
		return false;
	}

}
