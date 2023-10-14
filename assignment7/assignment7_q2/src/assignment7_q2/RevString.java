package assignment7_q2;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=in.nextLine();
		StringBuilder sb=new StringBuilder(str);
		
		sb.reverse();
		
		System.out.println(sb);

	}

}