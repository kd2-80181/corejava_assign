package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		ListIterator<Book> itr;
		int choice;
		int index;
		do {
			System.out.println("-------------------------------------------");
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("7. EXIT ");
			choice = sc.nextInt();
			System.out.println("-------------------------------------------");
			
			switch(choice) {
			case 1:
				Book b = new Book();
				b.acceptData(sc);
				if(list.contains(b)) {
					System.out.println("Book Alredy Exists");
					index = list.indexOf(b);
					Book bk = list.get(index);
					bk.setQuantity(bk.getQuantity()+b.getQuantity());
				}	
				else {
					System.out.println("Book Added");
					list.add(b);
				}
				break;
			case 2:
			    	for (int i=0 ;i < list.size();i++) {
			    		System.out.println(list.get(i));
			    	}
			    break;	
			case 3:
				System.out.println("Enter the isbn of book you want to find = ");
				sc.nextLine();
				String isbn = sc.nextLine();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key)) {
					System.out.println("Book Found");
				}
				else {
					System.out.println("Book is not found");
				}
				break;
			case 4:
				System.out.println("Please Enter The Index at Which You Want to Delete Book = ");
	    		index = sc.nextInt();
	    		list.remove(index);
	    		break;
			case 5:
				System.out.println("Enter the isbn of book you want to delete = ");
				sc.nextLine();
				String isbn1 = sc.nextLine();
				Book key1 = new Book();
				key1.setIsbn(isbn1);
				if(list.contains(key1)) {
					index = list.indexOf(key1);
					list.remove(index);
				}
				break;
			case 6:
				Collections.reverse(list);
				System.out.println(list);
				break;
		
			}
		}while(choice != 7);
		
		System.out.println("Thank you for using our Application");
	}

}
