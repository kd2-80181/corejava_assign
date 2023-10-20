package com.solution07;

import java.util.Random;
import java.util.stream.Stream;

public class Solution07Main {

	public static void main(String[] args) {
		Random r=new Random();
		
		int sum=Stream
				.generate(()->r.nextInt(10))
				.limit(10)
				.reduce(0,(x,y)->x+y);
		//First Parameter is the sum
		/*
		 * Sum of Numbers from 1 to 5
		int sum=Stream
					.iterate(1,x->x+1)
					.limit(5)
					.reduce(0, (x,y)->x+y);
		*/
		System.out.println(sum);
		
		
			  	

	}

}
