package com.assignment13;

import java.io.BufferedReader;
import java.io.FileReader;

public class Solution04Main {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("Q4.txt")){
			
			try(BufferedReader bwr=new BufferedReader(fr)){
				
				String line;
				while((line=bwr.readLine())!=null) {
					System.out.println(line);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
