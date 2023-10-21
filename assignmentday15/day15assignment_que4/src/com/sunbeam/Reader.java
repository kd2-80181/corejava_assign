package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {

	public static void read() {
		try(FileReader fr = new FileReader("/home/sunbeam/Desktop/JAVA/Assignment/JAVA/Day15Assignment/day15assignment_que3/Line.txt")){
			try(BufferedReader br = new BufferedReader(fr)){
				String line;
				while((line=br.readLine()) != null) {
					System.out.println(line);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		read();
	}

}
