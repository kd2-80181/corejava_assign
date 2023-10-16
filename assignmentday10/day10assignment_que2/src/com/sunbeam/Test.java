package com.sunbeam;

public class Test {
	
	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.get().show();
		}
	
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
		}
	
	public static void main(String[] args) {
//		Person p = new Person();
//		p.accept();
		
		Box<Person> b = new Box<>();
		b.set(new Person("Chetan",27));
		b.get().show();
		System.out.println("----------------------------");
		printDisplayableBox(b);
		printAnyBox(b);
		System.out.println("----------------------------");
		Box<Date> b1 = new Box<>();
		b1.set(new Date(8,12,1996));
		b1.get().show();
		System.out.println("----------------------------");
		printDisplayableBox(b1);
		printAnyBox(b1);
		System.out.println("----------------------------");
		
		Box<String> b3 = new Box<>();
		b3.set(new String("Sankalp"));
	//	printDisplayableBox(b3);  gives compile time error
		printAnyBox(b3);
	}

}
