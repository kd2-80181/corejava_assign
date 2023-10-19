package day13assignment_que5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Map<String,Book> map = new HashMap<String, Book>();
//		map.put("s10",new Book("s10",560.95,"book1",50));
//		map.put("s12",new Book("s12",570.85,"book2",60));
//		map.put("s15",new Book("s15",675.63,"book3",80));
//		map.put("s11",new Book("s11",875.79,"book4",40));
//		map.put("s14",new Book("s14",910.25,"book5",90));
//		map.put("s13",new Book("s13",169.64,"book6",20));
//		map.put("s10",new Book("s10",560.95,"book1",50));
//		
//		Set<Entry<String, Book>> set = map.entrySet();
//		for(Entry<String, Book> ele: set) {
//			System.out.println(ele);
//		}
		
		int choice;
		do {
			System.out.println("---------------Menu---------------");
			System.out.println("1. Add Book");
			System.out.println("2. Search Book");
			System.out.println("3. EXIT");
			choice = sc.nextInt();
			System.out.println("-----------------------------------");
			switch(choice) {
			case 1:
				Book b = new Book();
				b.acceptData(sc);
				map.put(b.getIsbn(),b);
				break;
			case 2:
				System.out.println("Enter the ISBN of book you Wnat to find = ");
				String isbn = sc.next();
				if(map.get(isbn) != null) {
					Book bk = map.get(isbn);
					System.out.println("Book Found = "+bk);
				}
				else {
					System.out.println("Book not found");
				}
				break;
			case 3:
				System.exit(10);
				break;
			default :
				System.out.println("Entered wrong choice....Please enter correct choice");
			}
		}while(choice > 0 );
		System.out.println("Thank you for using our Application");
	}

}
