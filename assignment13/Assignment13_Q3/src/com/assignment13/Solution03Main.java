package com.assignment13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution03Main {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		try(FileWriter writer = new FileWriter("Q3.txt"))
		{
			try(BufferedWriter bwr=new BufferedWriter(writer)){
				for(int i=0;i<4;i++)
				{
					System.out.print("Enter String : ");
					String str=in.nextLine();
					bwr.write(str+"\n");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		
		

	}

}
