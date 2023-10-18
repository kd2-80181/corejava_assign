package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MaxStringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int diff = s1.length()-s2.length();
		return diff;
	}
	
}

class MinStringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int diff = - (s1.length()-s2.length());
		return diff;
	}
	
}
public class MyList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hi how are you?");
		list.add("Hi how are you doing?");
		list.add("What is this?");
		list.add("Thank you so much");
		list.add("Good Morning");
		
		System.out.println(Collections.max(list,new MaxStringComparator())); // Gives string with highest length
		
		System.out.println(Collections.max(list,new MinStringComparator())); // Gives string with lowest length
		
	}

}
