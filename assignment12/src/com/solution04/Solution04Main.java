package com.solution04;

interface Check<T> {
	boolean compare(T x, T y);
}

public class Solution04Main {

	static <T> int countIf(T[] arr, T key, Check<T> c) {

		int count = 0;

		for (T ele : arr) {
			if (c.compare(ele, key)) {
//				System.out.println(ele);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Integer[] arr = { 11, 22, 44, 33, 55, 100, 101 };
		Integer key = 50;

		/*
		 * int ans = countIf(arr, key, new Check<Integer>() {
		 * 
		 * @Override public boolean compare(Integer a, Integer b) { return a > b; }
		 * 
		 * });
		 */

		int ans2 = countIf(arr, key, (x, y) -> x > y);

		System.out.println(ans2);
	}

}
