package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable {
	
	private String name;
	private int age;
	
	public Person() {
		this.name = "--";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the Name of Person : ");
		this.name = sc.nextLine();
		System.out.println("Enter the Age of The Person : ");
		this.age = sc.nextInt();
	}
	
	@Override
	public void show() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name of person is "+this.name+" and his age is "+this.age;
	}
}
