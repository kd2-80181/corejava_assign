package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class CityMarksName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int diff = - (s1.getCity().compareTo(s2.getCity()));
		if(diff == 0) {
			diff = - (Double.compare(s1.getMarks(),s2.getMarks()));
			if(diff == 0) 
				diff = s1.getName().compareTo(s2.getName());
				return diff;
		}
		return diff;
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		Student [] arr = new Student[6];
		arr[0] = new Student(1,"Chetan","Pune",87.53);
		arr[1] = new Student(3,"Sankalp","Nagar",85.33);
		arr[2] = new Student(2,"Shubham","Barshi",81.03);
		arr[3] = new Student(5,"Chaitanya","Nashik",88.97);
		arr[4] = new Student(4,"Sarvesh","Nashik",97.63);
		arr[5] = new Student(6,"Nilesh","Nagar",85.33);
		CityMarksName citymarksname = new CityMarksName();
		
		System.out.println("Before Sort");
		for(Student ele : arr) {
			System.out.println(ele);
		}
		Arrays.sort(arr,citymarksname);
		
		System.out.println("After sort");
		for(Student ele : arr) {
			System.out.println(ele);
		}
		
	}

}
