package com.sunbeam;

import java.util.Comparator;

class DoubleSort implements Comparator<Double>{

	@Override
	public int compare(Double d1, Double d2) {
		int diff = d1.compareTo(d2);
		return diff;
	}
	
}

public class SortArray {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {   
		    for(int j=i+1; j<arr.length; j++) {
		        if(c.compare(arr[i], arr[j]) > 0) {
		           T temp = arr[i];
		           arr[i] = arr[j];
		           arr[j] = temp;
		         }
		
		       }
		   }
		}

	public static void main(String[] args) {
		
		DoubleSort doublesort = new DoubleSort();
		
		Double [] arr1 = {66.6, 22.2, 55.5, 44.4, 33.3, 11.1};
		System.out.println("Before Sort");
		for(Double ele : arr1)
		System.out.println(ele);
		System.out.println("--------------------------------");
		selectionSort(arr1,doublesort);
		System.out.println("--------------------------------");
		System.out.println("Before Sort");
		for(Double ele : arr1)
		System.out.println(ele);

	}

}
