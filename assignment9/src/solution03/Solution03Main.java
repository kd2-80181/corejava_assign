package solution03;

import java.util.Arrays;
import java.util.Comparator;

class Compare implements Comparator<Student>
{

	@Override
	public int compare(Student a, Student b) { 
		int diff= - a.getCity().compareTo(b.getCity());
		if(diff==0)
		{
			diff=-Double.compare(a.getMarks(), b.getMarks());
			if(diff==0)
			{
				diff = a.getName().compareTo(b.getName());
			}
		}
		return diff;
	}
	
}
public class Solution03Main {
	
	
	public static void main(String[] args) {
		
		Student arr[]=new Student[5];
		arr[0]=new Student(1,"Abhey","Chd",90);
		arr[1]=new Student(2,"Karan","Pune",80);
		arr[2]=new Student(3,"Tarun","Mumbai",30);
		arr[3]=new Student(4,"Nilesh","Karad",50);
		arr[4]=new Student(5,"Kartik","Delhi",70);
		
		Arrays.sort(arr,new Compare());
		
		for(Student e:arr)
		{
			System.out.println(e);
		}
	}

}
