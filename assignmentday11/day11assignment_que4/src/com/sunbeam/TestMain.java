package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestMain {
	
	public static int menu(){
		Scanner sc = new Scanner(System.in);
		int choice ;
		System.out.println("-------------------------------------------");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("8. EXIT ");
		choice = sc.nextInt();
		System.out.println("-------------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		int choice;
		int index;
	    while((choice = menu()) != 8) {
	    	
	    	switch(choice) {
	    	case 1:
	    		Book b = new Book();
	    		b.acceptData();
	    		list.add(b);
	    	    break;
	    	    
	    	case 2:
	    		for(Book bk : list) {
	    			System.out.println(bk);
	    		}
	    		break;
	    		
	    	case 3:
	    		System.out.println("Please Enter The Index at Which You Want to Delete Book = ");
	    		index = sc.nextInt();
	    		list.remove(index);
	    		break;
	    		
	    	case 4:
	    		Book key = new Book();
	    		System.out.println("Please Enter the isbn of Book You Want to Find = ");
	    		String isbn = sc.next();
	    		key.setIsbn(isbn);
	    		if(list.contains(key)) {
	    			System.out.println("Book Found");
	    		}
	    		else {
	    		System.out.println("Book Not Found");
	    		}
	    		break;
	    		
	    	case 5:
	    		list.clear();
	    		break;
	    		
	    	case 6:
	    		System.out.println("No.of books = "+list.size());
	    		break;
	    		
	    	case 7:
	    	    {
	    		class PriceComparator implements Comparator<Book>{

					@Override
					public int compare(Book b1, Book b2) {
						int diff = - b1.getIsbn().compareTo(b2.getIsbn());
					 	return diff;
					 }
	    		   }
	    		PriceComparator comp = new PriceComparator();
	    		list.sort(comp);
	    	    }
	    	     break;
	    	     
	    	default :
	    		System.out.println("Entered The Wrong Choice...Please Enter a Valid Choice");
	    	}
	    	
	    }

	}

}
