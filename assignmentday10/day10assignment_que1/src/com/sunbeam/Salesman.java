package com.sunbeam;

public class Salesman extends Employee {
	
	private double comm;

	
	protected void accept_salesman()
	    {
	        acceptEmployee();
	        acceptComm();
	    }

	protected void display_salesman()
	    {

	        displayEmployee();
	        displayComm();
	        
	    }
    
	protected void acceptComm()
	    {
	     	
	        System.out.println("Enter the Commission Amount = ");
	        this.comm = sc.nextDouble();
	        
	    }

	protected void displayComm()
	    {
	        System.out.println("Commission Amount = "+this.comm);
	    }
    
	public Salesman() 
	    {
	     	this.comm = 0.00;
	    }

	public Salesman(int id, double sal, double comm) 
	    {
		    super(id, sal);
		    this.comm = comm;
	    }
	
	public double getComm() 
	    {
		    return comm;
	    }
	
	public void setComm(double comm) 
	    {
		    this.comm = comm;
	    }

	@Override
	public double calcTotalSalary() {
           double totalSalary = super.get_sal() + this.getComm();
           return totalSalary;
	}

}




