package com.sunbeam;

import java.util.function.Predicate;

public class CountString {

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	public static void main(String[] args) {
		
		String[] arr = { "Nilesh", "Shubham", "Vrushabh", "Omkarchougule", "Prashant" };
		// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
		
		String [] arr1 = {"Shrilekh","Omkar","Sarvesh","Shubham","Rajesh","Tejas"};
		int cnt = countIf(arr, new Predicate<String>() {
		public boolean test(String s) {
		return s.length() > 6;
		}
		});
		System.out.println("Result: " + cnt); // 2
		// call countIf() to count number of strings have length more than 6 -- using lambda expressions
		
		int c = countIf(arr1, s-> s.length()>6);
			System.out.println("Count = "+c);
        
	}

}
