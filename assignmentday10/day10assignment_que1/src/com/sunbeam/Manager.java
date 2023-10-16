package com.sunbeam;

public class Manager extends Employee {
	   private double bonus;
	  
	   protected void acceptBonus()
	    {
	       System.out.println("Enter the Bonus Amount = ");
	       this.bonus = sc.nextDouble();
	      
	    }
	   
	   protected void displayBonus()
	    {
	       System.out.println("Bonus Amount = "+this.bonus);
	    }

	   
	   protected void accept_manager()
	    {
	        acceptEmployee();
	        acceptBonus();
	    }

	   protected void display_manager()
	    {

	        displayEmployee();
	        displayBonus();
	        
	    }
	   
	   
	   public Manager() 
	   {
		   this.bonus = 0;
	   }

	   public Manager(int id, double sal, double bonus) 
	   {
		   super(id, sal);
		   this.bonus = bonus;
	   }
	   
	   public double getBonus() 
	   {
		return bonus;
	   }
	   
	   public void setBonus(double bonus) 
	   {
		this.bonus = bonus;
       }

	@Override
	public double calcTotalSalary() {
		double totalSalary = super.get_sal()+this.getBonus();
		return totalSalary;
	}
	
	 
}
