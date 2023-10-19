package com.sunbeam;

import java.util.Objects;

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
	public int hashCode() {
		int hash = Objects.hash(this.isbn); 
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book) {
			Book other = (Book) obj;
			if(this.isbn.equals(other.isbn)) // it will return true or false		                                      
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Book [ isbn: "+this.isbn+",price: "+this.price+",authorName: "+this.authorName+",quantity: "+this.quantity+" ]";
	}


}
