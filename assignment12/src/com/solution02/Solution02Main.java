package com.solution02;

import java.util.function.Predicate;

public class Solution02Main {

	public static int countIf(String arr[], Predicate<String> cond) {
		int count = 0;

		for (String str : arr) {
			if (cond.test(str)) {
				System.out.println(str);
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		String arr[] = { "Nilesh", "Abhey Khurana", "Ansh", "Bhanu Pratap Singh", "Shikhar Sharma","1234567"};

		/*
		 * int ans=countIf(arr, new Predicate<String>() {
		 * 
		 * @Override public boolean test(String a) { if(a.length()>6) return true;
		 * return false; } });
		 */

		int ans = countIf(arr, (s) -> s.length() > 6);

		System.out.println("Count of Strings : " + ans);

	}

}
