package solution01;
import java.util.Scanner;

public abstract class Employee extends Person {

		protected int id;
		protected double sal;
		protected String designation;
		public Employee() {
			// TODO Auto-generated constructor stub
		}
	
		public Employee(int id, double sal, String designation) {
			this.designation = designation;
	        this.id = id;
	        this.sal = sal;
		}
		public void accept(Scanner sc) {
			super.accept(sc);
	        System.out.println("Enter Employee id : ");
	        this.id= sc.nextInt();
	        System.out.println("Enter salary : ");
	        this.sal= sc.nextDouble();
	    }
	    public void display() {
	    	super.display();
	        System.out.println(" Employee ID : "+this.id);
	        System.out.println(" Salary : "+this.sal);
	    }
	    public int getId() {
	        return this.id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public double getSal() {
	        return this.sal;
	    }
	    public void setSal(int sal) {
	        this.sal = sal;
	    }
	    public String getDesignation() {
	        return this.designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
	    
	    public abstract double  calculateSalary() ;
	    
}
