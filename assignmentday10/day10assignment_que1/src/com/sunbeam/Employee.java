package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
  
	Scanner sc = new Scanner(System.in);
	
	private int id;
	private double sal;
	
    public Employee() {
		this.id = 0;
		this.sal = 0.00;
	}	

	public Employee(int id, double sal)
	    {
	        this.id = id;
	        this.sal = sal;
	    }

	public int get_id()
	    {
	        return this.id;
	    }

    public void set_id(int id)
	    {
	       this.id = id;
	    }

    public double get_sal()
	    {
	       return this.sal;
	    }

    public  void set_sal(double sal)
	    {
	       this.sal = sal;
	    }
    
    public void acceptEmployee()
	    {
    	
    	System.out.println("Enter the Employee ID = ");
        this.id = sc.nextInt();
        System.out.println("Enter the Employee Salary = ");
        this.sal = sc.nextDouble();
       
	    }
    
    public void displayEmployee() {
    	System.out.println("---------------------"); 
	    System.out.println("Employee ID : "+this.id); 
	    System.out.println("Employee Salary : "+this.sal);
    }
    
    abstract public double calcTotalSalary();
     
    
}
