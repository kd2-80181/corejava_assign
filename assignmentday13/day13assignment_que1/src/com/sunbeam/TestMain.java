package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {

		Set<Book> set = new HashSet<>();
		set.add(new Book("s10",560.95,"book1",50));
		set.add(new Book("s12",570.85,"book2",60));
		set.add(new Book("s15",675.63,"book3",80));
		set.add(new Book("s11",875.79,"book4",40));
		set.add(new Book("s14",910.25,"book5",90));
		set.add(new Book("s13",169.64,"book6",20));
		set.add(new Book("s10",570.95,"book1",50)); // duplicate is getting added even though equals() is overrided
		// also Books are store in Non-Ordered manner (elements stored in any order -- based on hashCode())
		
		//after overriding the hashcode() with equals() duplicate values are nor added neither replacing original values
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
	}

}
