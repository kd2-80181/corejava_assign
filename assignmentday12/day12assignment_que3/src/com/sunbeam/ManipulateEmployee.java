package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class AscComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = e1.getEmpid() - e2.getEmpid();
		return diff;
	}
	
}

class DscComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int diff = -(e1.getEmpid()-e2.getEmpid());
		return diff;
	}
	
}

public class ManipulateEmployee {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		List<Employee> list = new LinkedList<Employee>();
		ListIterator<Employee> itr;
		int choice;
		int index;
		do {
			System.out.println("--------------------Menu--------------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Show All Employees");
			System.out.println("3. Find Employee");
			System.out.println("4. Edit Employee Details");
			System.out.println("5. Sort in Ascending Order");
			System.out.println("6. Sort in Descending Order");
			System.out.println("7. EXIT");
			choice = sc.nextInt();
			System.out.println("--------------------------------------------");
			switch(choice) {
			case 1:
				Employee emp = new Employee();
				emp.acceptData(sc);
				list.add(emp);
				break;
			case 2:
				itr = list.listIterator();
				while(itr.hasNext()) {
					Employee ele = itr.next();
					System.out.println(ele);
				}
				break;
			case 3:
				System.out.println("Enter the Employee Id of the Employee you want to find : ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setEmpid(id);
				if(list.contains(key)) {
					index = list.indexOf(key);
					System.out.println(list.get(index));
				}
				break;
			case 4:
				System.out.println("Enter the Id of Employee whose details you want to edit : ");
				int id1 = sc.nextInt();
				Employee key1 = new Employee();
				key1.setEmpid(id1);
				if(list.contains(key1)) {
					index = list.indexOf(key1);
					System.out.println("Enter the new Empid : ");
					int empid = sc.nextInt();
					list.get(index).setEmpid(empid);
					System.out.println("Enter the new Name : ");
					sc.nextLine();
					String name = sc.nextLine();
					list.get(index).setName(name);
					System.out.println("ENter the new Salary : ");
					double sal = sc.nextDouble();
					list.get(index).setSalary(sal);
				}
				break;
			case 5:	
				AscComparator comp = new AscComparator();
				Collections.sort(list,comp);
				break;
			case 6:
				DscComparator comp1 = new DscComparator();
				Collections.sort(list, comp1);
				break;
			case 7:
				System.exit(10);
				break;
			default	:
				System.out.println("Wrong Choice....Please enter Valid Choice");
			}
		}while(choice > 0);
		System.out.println("Thank you for using our Application");
	}

}
