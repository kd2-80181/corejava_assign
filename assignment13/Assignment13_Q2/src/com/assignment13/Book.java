package com.assignment13;


import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable{

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	static Scanner in = new Scanner(System.in);
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book()
	{
		
	}
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void accept() {
		System.out.print("Enter isbn of Book : ");
		this.isbn = in.next();

		System.out.print("Enter price of Book : ");
		this.price = in.nextDouble();

		in.nextLine();
		System.out.print("Enter Author Name: ");
		this.authorName = in.nextLine();

		System.out.print("Enter Quantity of books: ");
		this.quantity = in.nextInt();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
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
	public boolean equals(Object other) {
		if (other == null)
			return false;
		else if (this == other)
			return true;
		else if (other instanceof Book) {
			Book otherObj = (Book) other;
			if (this.isbn.equals(otherObj.isbn)) {
				return true;
			}
		}
		return false;
	}

}
