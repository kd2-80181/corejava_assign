package assignment_1;

public class Qsn4c {

	public static void main (String [] ergs) {
	
			for (int i = 1; i <= 5; i++) {
				for (int k = 4; k >=i; k--)
					System.out.print(" ");
				for (int j = 0; j < 2*i-1; j++) 
					System.out.print("*");
				System.out.println();
			}
			
	}
}
