package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
		int choice;
		do {
			System.out.println("-------------------MENU-------------------");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Student");
			System.out.println("3. Search Student");
			System.out.println("4. EXIT");
			choice = sc.nextInt();
			System.out.println("------------------------------------------");
			switch(choice) {
			case 1:
				Student s = new Student();
				s.acceptData(sc);
				map.put(s.getRoll(),s);
				break;
			case 2:
				Set<Entry<Integer, Student>> m = map.entrySet();
				for (Entry<Integer, Student> entry : m) {
					System.out.println("Student List "+entry.getValue());
				}
				break;
			case 3:
				System.out.println("Enter the Roll No of Student You Want to Search : ");
				int roll = sc.nextInt();
				if(map.get(roll) != null) {
					Student s1 = map.get(roll);
					System.out.println("Student Found : "+s1);
				}
				else {
					System.out.println("Student not Found");
				}
				break;
			case 4:
				System.exit(10);
				break;
			default :
				System.out.println("Entered wrong choice....Please enter correct choice");
				break;
			}
		}while(choice > 0);
		System.out.println("Thank you for using our Application");
	}

}
