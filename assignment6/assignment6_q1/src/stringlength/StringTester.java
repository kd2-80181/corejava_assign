package stringlength;

public class StringTester {
	public static void main(String[] args) {
		
		ReadString reader=new ReadString();
		
		try {
			reader.readString();
			System.out.println(reader);
		} catch (ExceptionLineTooLong e) {
			System.err.println(e);
		}
	
		
		

	}

}
