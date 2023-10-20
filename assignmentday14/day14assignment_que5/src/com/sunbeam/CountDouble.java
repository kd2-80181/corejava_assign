package com.sunbeam;

import java.util.Scanner;

interface Check<T>{
	boolean compare (T a,T b);
}

public class CountDouble {
	
	static <T> int countif(T[] arr,T key, Check<T> c){
		int cnt = 0;
		for(T ele : arr) {
			if(c.compare(ele, key))
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int result = countif(arr, key, (x,y)-> x>y);
		System.out.println(result);

		Double [] arr1 = {11.1,1.2,12.2,11.1,1.2,15.2,13.2,11.1};
		System.out.println("Please enter Number to get count of its repetition = ");
		Double key1 = sc.nextDouble();
		
		int count = countif(arr1, key1, (x,y)->x.equals(y));
		System.out.println("Number of Repititions of "+key1+" = "+count);
		
	}

}
