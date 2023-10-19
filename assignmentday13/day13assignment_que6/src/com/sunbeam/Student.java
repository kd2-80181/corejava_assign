package com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter The Student Roll No : ");
		this.roll = sc.nextInt();
		System.out.println("Enter the Student Name : ");
		sc.nextLine();
		this.name = sc.nextLine();
		System.out.println("Enter the Student City : ");
		this.city = sc.nextLine();
		System.out.println("Enter the Student Marks : ");
	    this.marks = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Student [ Roll No: "+this.roll+", Name: "+this.name+", City: "+this.city+", Marks: "+this.marks;
	}

	

}
