package com.sunbeam;

import java.util.Scanner;

public class Book {
	
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	Scanner sc = new Scanner(System.in); 
	public void acceptData() {
		System.out.println("Enter the isbn no = ");
		this.isbn = sc.nextLine();
		System.out.println("Enter the Price = ");
		this.price = sc.nextDouble();
		
		System.out.println("Enter the Author Name = ");
		this.authorName = sc.next();
		
		System.out.println("Enter the Quantity = ");
	    this.quantity = sc.nextInt();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Book [ isbn: "+this.isbn+",price: "+this.price+",authorName: "+this.authorName+",quantity: "+this.quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book))
		return false;
		Book bo = (Book) obj;
		if(this.isbn.equals(bo.isbn)) {
			return true;
		}
		else {
		return false;
		}
	}
}
