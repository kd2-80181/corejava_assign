package stringlength;

public class ExceptionLineTooLong extends Exception{
	
	String text;

	public ExceptionLineTooLong(String text) {
		this.text = text;
	}
	
	public String toString()
	{
		return this.text;
	}
	
	

}

