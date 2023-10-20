package com.solution03;

import java.util.Scanner;

//checks if the interface has SAM (Single Abstract Method)
@FunctionalInterface 
interface Arithmetic {
	double calc(double a, double b);
}

public class Solution03Main {

	static void calculate(double a, double b, Arithmetic op) {
		double ans = op.calc(a, b);
		System.out.println("Result : " + ans);
	}

	public static void main(String[] args) {

		/*
		 * calculate(2.4,3.5,new Arithmetic() {
		 * 
		 * @Override public double calc(double a,double b) { return a+b; } });
		 */

		Scanner in = new Scanner(System.in);
		int choice;
		double a, b, ans;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");

			System.out.println("Enter Your Choice : ");
			choice = in.nextInt();

			System.out.println("Enter first value : ");
			a = in.nextDouble();
			System.out.println("Enter second value : ");
			b = in.nextDouble();

			switch (choice) {
			case 1:
				calculate(a, b, (x, y) -> x + y);
				break;
			case 2:
				calculate(a, b, (x, y) -> x - y);
				break;
			case 3:
				calculate(a, b, (x, y) -> x * y);
				break;
			case 4:
				calculate(a, b, (x, y) -> x / y);
				break;
			default:
				System.out.println("Wrong Choice Entered.");
				break;
			}
		} while (choice != 0);
	}

}
