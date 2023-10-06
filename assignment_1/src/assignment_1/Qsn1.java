package assignment_1;

import java.util.Scanner;

public class Qsn1 {
	public static void main(String [] erg) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
		    int number = sc.nextInt();
		
		System.out.println("Given number:" +number);
		System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
	    System.out.println("Octal equivalent: " + Integer.toOctalString(number));
	    System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));	
	}
}

