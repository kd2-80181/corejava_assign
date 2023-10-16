package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.accept_manager();
//		m.display_manager();
//		System.out.println("Total Salary of Manager : "+m.calcTotalSalary());
		
		Box<Employee> b1 = new Box<>();
		b1.set(m);
		
		System.out.println("Total Salary of Manager is : "+b1.totalSalary());
		
		Salesman s = new Salesman();
		s.accept_salesman();
//		s.display_salesman();
//		System.out.println("Total Salary of Salesman is : "+s.calcTotalSalary());
		
		Box<Employee> b = new Box<>(); 
		b.set(s);
		
		System.out.println("Total Salary of Salesman is : "+b.totalSalary());
		
		
		
		

	}

}
