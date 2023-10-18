package solution03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution03Main {

	static Scanner in = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Employee.");
		System.out.println("2. Delete Employee.");
		System.out.println("3. Find Employee.");
		System.out.println("4. Sort Employee List.");
		System.out.println("5. Edit Employee.");
		System.out.println("6. Display Employees.");
		System.out.println("------------------------------------------");

		System.out.println("Enter Your Choice : ");
		choice = in.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		class sortEmployee implements Comparator<Employee> {

			@Override
			public int compare(Employee a, Employee b) {
				return a.getEmpno() - b.getEmpno();
			}
		}

		List<Employee> empList = new LinkedList<>();

		int choice;
		do {
			choice = menu();
			Employee temp, key;
			int empNo;

			switch (choice) {
			case 1:
				temp = new Employee();
				temp.accept();
				empList.add(temp);
				System.out.println("Employee Added.");
				break;

			case 2:
				System.out.println("Enter empno to delete : ");
				empNo = in.nextInt();

				key = new Employee();
				key.setEmpno(empNo);

				if (empList.contains(key)) {
					empList.remove(key);
					System.out.println("Employee Deleted.");
				} else {
					System.out.println("Employee not found.");
				}
				break;

			case 3:
				System.out.println("Enter empno to Find: ");
				empNo = in.nextInt();

				key = new Employee();
				key.setEmpno(empNo);

				if (empList.contains(key)) {
					int idxFound = empList.indexOf(key);
					System.out.println("Employee found at index " + idxFound);
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 4:
				empList.sort(new sortEmployee());
				Iterator<Employee> itr = empList.iterator();

				while (itr.hasNext()) {
					Employee e = itr.next();
					System.out.println(e);
				}
				break;

			case 5:
				System.out.println("Enter empNo to edit : ");
				empNo = in.nextInt();
				key = new Employee();
				key.setEmpno(empNo);
				int idx = empList.indexOf(key);
				if (idx != -1) {
					Employee oldEmployee = empList.get(idx);

					oldEmployee.updateEmployee();
				} else {
					System.out.println("Employee Not found.");
				}
				break;
			case 6:
				Iterator<Employee> itr2=empList.iterator();
				while(itr2.hasNext())
				{
					Employee e=itr2.next();
					System.out.println(e);
				}
				break;
			default:
				System.out.println("Entered Wrong Choice.");
				break;
			}
		} while (choice != 0);

	}

}
