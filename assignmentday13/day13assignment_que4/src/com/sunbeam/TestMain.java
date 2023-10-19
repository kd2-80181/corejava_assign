package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class DescPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int diff = -(Double.compare(b1.getPrice(),b2.getPrice()));
		return diff;
	}
	
}

public class TestMain {
	
	public static void main(String[] args) {

		 DescPrice cmp = new DescPrice(); // Instance of comparator class
	        NavigableSet<Book> set1 = new TreeSet<>(cmp); // Books will be ordered in descending order of price
	        set1.add(new Book("s10",560.95,"book1",50));
	        set1.add(new Book("s12",570.85,"book2",60));
	        set1.add(new Book("s15",675.63,"book3",80));
	        set1.add(new Book("s11",875.79,"book4",40));
	        set1.add(new Book("s14",910.25,"book5",90));
	        set1.add(new Book("s13",169.64,"book6",20));
	        set1.add(new Book("s10",560.95,"book1",50));
		System.out.println("Using Iterator");
		Iterator<Book> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Book b = itr1.next();
			System.out.println(b);
		}
		
//		System.out.println();
//		
//		System.out.println("Using DescendingIterator");
//		Iterator<Book> itr = set1.descendingIterator();
//		while(itr.hasNext()) {
//			Book b = itr.next();
//			System.out.println(b);
//		}
	}

}
