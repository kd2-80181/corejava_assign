package solution4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Solution04Main {
	
	
	
	static Scanner in = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add New Book.");
		System.out.println("2. Display All Books.");
		System.out.println("3. Delete a Book from Idx.");
		System.out.println("4. Check if book with given isbn is there or not.");
		System.out.println("5. Delete All Books.");
		System.out.println("6. Display Number of Books in the list.");
		System.out.println("7. Sort All Books w.r.t price Desc.");
		System.out.println("------------------------------------------");

		System.out.println("Enter Your Choice : ");
		choice = in.nextInt();

		return choice;

	}

	
	public static void main(String[] args) {
		
		class sortDesc implements Comparator<Book> 
		{
			@Override
			public int compare(Book a,Book b)
			{
				return -a.getIsbn().compareTo(b.getIsbn());
			}
		}
		
		
		ArrayList<Book> BookList = new ArrayList<>();
		int choice;
		while ((choice=menu()) != 0) {
			switch (choice) {
			case 1:
				Book temp = new Book();
				temp.accept();
				BookList.add(temp);
				break;
			case 2:
				for (Book b : BookList) {
					System.out.println(b);
				}
				break;
			case 3:
				System.out.println("Enter Idx from 0 to " + BookList.size() + " : ");
				int idx = in.nextInt();
				BookList.remove(idx);
				break;
				
			case 4:
				in.nextLine();
				System.out.println("Enter isbn to check : ");
				String isbnSearch=in.nextLine();
				
				Book isbnSearchKey=new Book();
				isbnSearchKey.setIsbn(isbnSearch);
				
				boolean ans=BookList.contains(isbnSearchKey);
				System.out.println(ans);
				break;
			case 5:
				System.out.println("Deleted All books.");
				BookList.clear();
				break;
			case 6:
				System.out.println("Total books : "+BookList.size());
				break;
			case 7:
				BookList.sort(new sortDesc());
				break;
			default:
				System.out.println("Wrong Choice.");
				break;
			}
		}

	}

}
