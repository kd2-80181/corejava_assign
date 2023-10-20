package com.solution01;

public class Solution01Main {

	public static void main(String[] args) {
		Emp arr[]=new Emp[3];
		
		arr[0]=new Manager(100,0);
		arr[1]=new Labor(400,200);
		arr[2]=new Clerk(5000);
		
		
		
		double totalSalry=Emp.calcTotalIncome(arr);
		
		System.out.println(totalSalry);
		
		
	}

}
