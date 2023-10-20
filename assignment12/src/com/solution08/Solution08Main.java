package com.solution08;

import java.util.stream.IntStream;

public class Solution08Main {

	public static void main(String[] args) {
		IntStream strm1=IntStream.range(1, 10);//1 - 9
		
		int total=strm1.sum();
		
		/*It will throw Illegal State Exception as sum is terminal operation
		and we are trying to use the same stream when it*/
		
		
		System.out.println(strm1.summaryStatistics());
		

	}

}
