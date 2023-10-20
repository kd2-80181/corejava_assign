package com.solution01;

public interface Emp {
	double getSal();

	default double calcIncentives() {
		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double totalSalary = 0;

		for (Emp e : arr) {
			totalSalary += e.getSal() + e.calcIncentives();
		}
		return totalSalary;
	}
}
