package assignment7_q4;

import java.util.Scanner;


public class Words {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string ");
			String string  = sc.nextLine();
			int count=0;  
			      
	        char ch[]= new char[string.length()];     
	        for(int i=0;i<string.length();i++)  
	        {  
	               ch[i]= string.charAt(i);  
	               if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
	                   count++;  
	        }  
	        System.out.println(count);
		}
		
	}
