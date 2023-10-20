package test;

import com.sunbeam.*;

public class EmpMaintest {

	public static void main(String[] args) {

		Emp [] arr = new Emp[3];
		arr[0] = new Manager(40000,10000);
		arr[1] = new Labor(5,100);
		arr[2] = new Clerk(15000);
		
		double total_income = Emp.calcTotalIncome(arr);
		System.out.println(total_income);
	}

}
