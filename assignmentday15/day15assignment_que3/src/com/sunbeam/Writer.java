package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Writer {
	
	public static void write() {
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("Line.txt")){
			try(BufferedWriter bw = new BufferedWriter(fw)){
				for(int i=0;i<4;i++) {
					System.out.println("Enter the Line "+i+": ");
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Lines Saved");
	}

	public static void main(String[] args) {

		write();
	}

}
