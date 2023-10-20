package com.solution05;

import java.util.Scanner;

interface Check<T> {
	boolean compare(T x, T y);
}

public class Solution05Main {

	static <T> int countIf(T[] arr, T key, Check<T> c) {

		int count = 0;

		for (T ele : arr) {
			if (c.compare(ele, key)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Double arr[] = { 10.4, 11.0, 22.3, 5.5, 10.4, 2.3, 2.5, 5.5 };

		System.out.print("Enter key to Find in Array : ");
		Double key = in.nextDouble();

		int ans = countIf(arr, key, (x, y) -> Double.compare(x, y) == 0);

		System.out.println(key + " is repeated " + ans + " times in array.");

//		System.out.println(5.5 == 5.5);
	}

}
