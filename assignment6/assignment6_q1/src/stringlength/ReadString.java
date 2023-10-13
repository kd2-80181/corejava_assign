package stringlength;

import java.util.Scanner;

public class ReadString {

	public static String text;
	static Scanner in = new Scanner(System.in);

	public void readString() throws ExceptionLineTooLong {//checked

		System.out.println("Enter String : ");

		text = in.nextLine();
		if (text.length() > 80) {
			throw new ExceptionLineTooLong("String too Long.");
		}

	}
	
	@Override
	public String toString()
	{
		return "String Entered : "+text+"\nString Length : "+text.length();
	}
}
