package assignment_1;

public class Qsn4a {

	public static void main(String [] ergs) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=9; j++)
			{
				if((i-j <=  0) && (i+j >= 10))
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}

	
	