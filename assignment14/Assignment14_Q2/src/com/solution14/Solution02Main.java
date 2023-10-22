package com.solution14;

import java.util.List;
import java.util.Scanner;

public class Solution02Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Add new User.");
			System.out.println("2. Update Existing user.");
			System.out.println("3. Display all Users.");
			System.out.println("4. Delete existing User by user_id.");
			
			System.out.println("Enter your Choice : ");
			choice=in.nextInt();
			int user_id;
			switch(choice)
			{
			case 1:
				User tempUser=new User();
				try {
				tempUser.accept();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				try(UserDao ud = new UserDao())
				{
					int cnt=ud.addUser(tempUser);
					System.out.println("Rows Affected : "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter Id of User to Update : ");
				user_id=in.nextInt();
				try(UserDao ud=new UserDao())
				{
					User tempUser1=new User();
					tempUser1.accept();
					int cnt=ud.updateUser(tempUser1);
					System.out.println("Rows Affected : "+cnt);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			case 3:
				try(UserDao ud=new UserDao())
				{
					List<User> result=ud.getAll();
					
					result.forEach(c -> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDao ud=new UserDao())
				{
					System.out.print("Enter User_id to delete : ");
					user_id=in.nextInt();
					
					int cnt=ud.deleteUser(user_id);
					System.out.println("Rows Affected : "+cnt);
				}//ud.close()
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid Choice Entered.");
				break;
			}
		}while(choice!=0);
			
			in.close();
		

	}

}
