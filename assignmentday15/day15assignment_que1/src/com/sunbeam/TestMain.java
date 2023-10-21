package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		int choice;
		int index;
		do {
			System.out.println("-------------------------------------------");
			System.out.println("1. Load Books From Fle");
			System.out.println("2. Add new book in list.");
			System.out.println("3. Display all books in forward order.");
			System.out.println("4. Search a book with given isbn");
			System.out.println("5. Delete a book at given index.");
			System.out.println("6. Delete a book with given isbn.");
			System.out.println("7. Reverse the list");
			System.out.println("8. Save Books in File");
			System.out.println("9. EXIT ");
			choice = sc.nextInt();
			System.out.println("-------------------------------------------");
			
			switch(choice) {
			case 1:
				try(FileInputStream fin = new FileInputStream("book.txt")){
					try(DataInputStream din = new DataInputStream(fin)){
						while(true) {
							Book bk = new Book();
							bk.setIsbn(din.readUTF());
							bk.setPrice(din.readDouble());
							bk.setAuthorName(din.readUTF());
							bk.setQuantity(din.readInt());
							list.add(bk);
						}
					}
				}
				catch(EOFException e1) {
					
				}
				catch(Exception e ) {
					e.printStackTrace();
				}
		
				System.out.println("Books Loaded Successfully");
				
				break;
			case 2:
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
			case 3:
			    	for (int i=0 ;i < list.size();i++) {
			    		System.out.println(list.get(i));
			    	}
			    break;	
			case 4:
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
			case 5:
				System.out.println("Please Enter The Index at Which You Want to Delete Book = ");
	    		index = sc.nextInt();
	    		list.remove(index);
	    		break;
			case 6:
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
			case 7:
				Collections.reverse(list);
				System.out.println(list);
				break;
			case 8:
				try(FileOutputStream fout = new FileOutputStream("book.txt")){
					try(DataOutputStream dout = new DataOutputStream(fout)){
						for (Book bk : list) {
							dout.writeUTF(bk.getIsbn());
							dout.writeDouble(bk.getPrice());
							dout.writeUTF(bk.getAuthorName());
							dout.writeInt(bk.getQuantity());
						}
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("books Saved");
				break;
			case 9:
				System.exit(11);
				break;
			default :
				System.out.println("Entered Wrong Choice...Please Enter Valid Choice");	
			}
		}while(choice > 0);
		
		System.out.println("Thank you for using our Application");
	}

}
