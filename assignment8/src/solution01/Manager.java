package solution01;

import java.util.Scanner;

public class Manager extends Employee{
		private double bonus;

		public Manager() {
	        this.designation = "Manager";
	        this.bonus = 0;
	    }
		public Manager(int id, float sal, float bonus) {
			super(id,sal,"Manager");
	    	this.bonus = bonus;
	    }
		public void accept(Scanner sc)
	    {
			super.accept(sc);
	        System.out.println("Enter bonus : ");
	        this.bonus= sc.nextFloat();
	    }
		public void display()
	    {
	        System.out.println("----------------------");
			super.display();
	        System.out.println(" Bonus : "+this.bonus);
	    }
		public double getBonus()
	    {
	        return this.bonus;
	    }
		public void setBonus(float bonus)
	    {
	        this.bonus = bonus;
	    }
		@Override
		public double calculateSalary() {
			return super.getSal()+bonus;			
		}
		@Override
		public String toString() {
			return "Manager [bonus=" + bonus + ", getId()=" + getId() + ", getSal()=" + getSal() + ", getDesignation()="
					+ getDesignation() + "]";
		}
		
		
}