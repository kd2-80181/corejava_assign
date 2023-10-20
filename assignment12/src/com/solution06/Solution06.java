package com.solution06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution06 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Number to find Factorial : ");
		int num=in.nextInt();
		
		List<Integer> list =new ArrayList<>();
		
		
		Stream<Integer> stream=list.stream();
		
		int ans=Stream
				.iterate(1, (x)->x+1)
				.limit(num)
				.reduce(1,(last_accum_value,new_value)->last_accum_value*new_value);
		
		System.out.println(ans);

	}

}
