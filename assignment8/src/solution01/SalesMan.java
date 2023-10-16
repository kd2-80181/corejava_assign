package solution01;
import java.util.Scanner;
public class SalesMan extends Employee{
	private double comm;

		public SalesMan() {
	        this.designation = "Salesman";
	        this.comm = 0.0;
	    }
		public SalesMan(int id, double sal, double comm) {
			super(id , sal,"Salesman");
	        this.comm = comm;
	    }
		public void accept(Scanner sc){
	        super.accept(sc);
	        System.out.println("Enter commision : ");
	        this.comm= sc.nextFloat();
	        
	    }
		public void display()
	    {
	        System.out.println("----------------------");
	        super.display();
	        System.out.println(" Commision : "+this.comm);
	    }
		public double getComm()
	    {
	        return this.comm;
	    }
		public void setComm(double comm)
	    {
	        this.comm = comm;
	    }
		@Override
		public double calculateSalary() {
			return super.getSal()+comm;
			
		}
		@Override
		public String toString() {
			return "Salesman [comm=" + comm + ", getId()=" + getId() + ", getSal()=" + getSal() + ", getDesignation()="
					+ getDesignation() + "]";
		}
		
}