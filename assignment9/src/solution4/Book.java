package solution4;

import java.util.Comparator;
import java.util.Scanner;

public class Book {
	
	static Scanner in=new Scanner(System.in);
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	
	

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public void accept()
	{
		System.out.println("Enter isbn of Book : ");
		this.isbn=in.next();
		
		System.out.println("Enter price of Book : ");
		this.price=in.nextDouble();
		
		
		System.out.println("Enter Author Name: ");
		this.authorName=in.next();
		
		System.out.println("Enter Quantity of books: ");
		this.quantity=in.nextInt();
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		else if(this==obj)
			return false;
		else if(obj instanceof Book) {
			Book other=(Book)obj;
			if(this.isbn.equals(other.getIsbn()))
			{
				return true;
			}
			return false;
		}
		else
			return false;
	}
	
	
}
