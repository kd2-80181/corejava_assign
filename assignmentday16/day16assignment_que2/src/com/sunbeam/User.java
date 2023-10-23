package com.sunbeam;

import java.util.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String pwd;
	private Date dob;
	private int status;
	private String roll;

	public User() {
	}

	public User(int id, String firstName, String lastName, String email, String pwd, Date dob, int status,
			String roll) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pwd = pwd;
		this.dob = dob;
		this.status = status;
		this.roll = roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "User [id: "+this.id+", First Name: "+this.firstName+", Last Name: "+this.lastName+", Email: "
				+this.email+", Password: "+this.pwd+", DOB: "+this.dob+", Status "+this.status+", roll: "+this.roll;
	}
	
}
