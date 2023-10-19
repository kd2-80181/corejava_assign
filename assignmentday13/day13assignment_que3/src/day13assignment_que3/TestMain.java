package day13assignment_que3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		
		//until and unless there is Comparable implemented in book we cant even add the element in Treeset
        SortedSet<Book> set = new TreeSet<>();
		set.add(new Book("s10",560.95,"book1",50));
		set.add(new Book("s12",570.85,"book2",60));
		set.add(new Book("s15",675.63,"book3",80));
		set.add(new Book("s11",875.79,"book4",40));
		set.add(new Book("s14",910.25,"book5",90));
		set.add(new Book("s13",169.64,"book6",20));
		set.add(new Book("s10",560.95,"book1",50));
	//	set.add(new Book(null,560.95,"book1",50)); throws exception  NullPointerException
		
		//Values are stored in Natural Order
		
		//After implementing Comparable no duplicate value can be added
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		
		
		 
	}

}
