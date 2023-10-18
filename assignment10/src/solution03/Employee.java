package solution03;

import java.util.Scanner;

public class Employee {
	private int empno;
	private String name;
	private double salary;

	static Scanner in = new Scanner(System.in);

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept() {
		System.out.print("Enter empNo : ");
		this.empno = in.nextInt();

		in.nextLine();

		System.out.print("Enter Name of Employee : ");
		this.name = in.nextLine();

		System.out.print("Enter Salary of Employee : ");
		this.salary = in.nextDouble();

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Employee) {
			Employee deriveObj = (Employee) obj;
			return this.empno == deriveObj.empno;
		}
		return false;
	}

	public void updateEmployee() {
		in.nextLine();
		System.out.println("Enter Name of Employee : ");
		this.name = in.nextLine();

		System.out.print("Enter Salary of Employee : ");
		this.salary = in.nextDouble();
	}
}
