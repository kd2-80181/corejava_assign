package solution02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionMain {

	public static void main(String[] args) {
		
		class checkStringLength implements Comparator<String>
		{
			@Override
			public int compare(String a,String b)
			{
				return a.length()-b.length();
			}
		}
		
		List<String> stringsList=new ArrayList<>();
		
		Collections.addAll(stringsList,"Abhey Khurana","Ansh","Ujjwal pratap Singh");
		
		String ans=Collections.max(stringsList,new checkStringLength());
		
		System.out.println("String with max Length :"+ans);
		

	}

}
