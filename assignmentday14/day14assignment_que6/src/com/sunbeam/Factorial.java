package com.sunbeam;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get Factorial : ");
		int num = sc.nextInt();
		Stream<Integer> strm = Stream.iterate(1, x-> x+1).limit(num);
		int fact = strm.reduce(1,(a,b)-> a*b);
		System.out.println("Factorial of "+num+" = "+fact);
	}

}
