package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class TestUser {
	static Scanner sc = new Scanner(System.in);
	public static int menu() {
		int choice;
		System.out.println("----------------MENU----------------");
		System.out.println("1. Add New User");
		System.out.println("2. Update User Info");
		System.out.println("3. Show All Users");
		System.out.println("4. Delete User");
		System.out.println("5. EXIT");
		choice = sc.nextInt();
		System.out.println("------------------------------------");
		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice = menu()) != 5) {
			switch(choice) {
			case 1:
				try(UserDao dao = new UserDao()){
					User u = new User();
					System.out.print("Enter the First Name: ");
					String fname = sc.next();
					System.out.print("Enter the Last Name: ");
					String lname = sc.next();
					System.out.print("Enter the Email: ");
					String email = sc.next();
					System.out.print("Enter the Password: ");
					String pwd = sc.next();
					System.out.print("Enter the Date of Birth(dd-MM-yyyy): ");
					String dob = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date date = sdf.parse(dob);
					u.setFirstName(fname);
					u.setLastName(lname);
					u.setEmail(email);
					u.setPwd(pwd);
					u.setDob(date);
					int cnt = dao.addUser(u);
					System.out.println("Rows Updated: "+cnt);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try(UserDao dao = new UserDao()){
					User u = new User();
					System.out.println("Enter the ID of User: ");
					int id = sc.nextInt();
					System.out.print("Enter the First Name: ");
					String fname = sc.next();
					System.out.print("Enter the Last Name: ");
					String lname = sc.next();
					System.out.print("Enter the Email: ");
					String email = sc.next();
					System.out.print("Enter the Password: ");
					String pwd = sc.next();
					System.out.print("Enter the Date of Birth(dd-MM-yyyy): ");
					String dob = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date udate = sdf.parse(dob);
					u.setFirstName(fname);
					u.setLastName(lname);
					u.setEmail(email);
					u.setPwd(pwd);
					u.setDob(udate);
					u.setId(id);
					int cnt = dao.updateUserById(u);
					System.out.println("Rows Updated: "+cnt);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try(UserDao dao = new UserDao()){
					List<User> list = dao.showAllUsers();
					list.forEach(u -> System.out.println(u));
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDao dao = new UserDao()){
					User u = new User();
					System.out.println("Enter the ID to be Deleted: ");
					int id = sc.nextInt();
					u.setId(id);
					int cnt = dao.deleteUserById(u);
					System.out.println("Rows Updated: "+cnt);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default :
				System.out.println("Entered Wrong Choice...Plese Enter Valid Choice");
			}
		}
		
		System.out.println("Thank You For Using Our Application");	
		
	}

}
