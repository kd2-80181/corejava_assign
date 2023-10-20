package day14assignment_que3;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic{
	double calc(double num1, double num2);
}

public class Calculator  {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int choice;
		double num1;
		double num2;
		do {
			System.out.println("---------------------MENU---------------------");
			System.out.println("Select the Operation to Perform : ");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. EXIT");
			choice = sc.nextInt();
			System.out.println("----------------------------------------------");
			switch(choice) {
			case 1:
				System.out.println("Enter the First Number ");
				num1 = sc.nextDouble();
				System.out.println("Enter the Second Number ");
				num2 = sc.nextDouble();
				calculate(num1, num2, (x,y)-> x+y);
				break;
			case 2:
				System.out.println("Enter the First Number ");
				num1 = sc.nextDouble();
				System.out.println("Enter the Second Number ");
				num2 = sc.nextDouble();
				calculate(num1,num2,(x,y)-> x-y);
				break;
			case 3:	
				System.out.println("Enter the First Number ");
				num1 = sc.nextDouble();
				System.out.println("Enter the Second Number ");
				num2 = sc.nextDouble();
				calculate(num1,num2,(x,y)-> x*y);
				break;
			case 4:
				System.out.println("Enter the First Number ");
				num1 = sc.nextDouble();
				System.out.println("Enter the Second Number ");
				num2 = sc.nextDouble();
				if(num2 == 0) {
				   System.out.println("Cannot Devide by 0"); 
				}
				else {
					calculate(num1,num2,(x,y)-> x/y);	
				}
				break;
			case 5:
				System.exit(10);
				break;
			}
		}while(choice > 0);
		
	}

}
