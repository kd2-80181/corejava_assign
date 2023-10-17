package solutions;

import java.util.Comparator;

public class Solution02<T> implements Comparator<Number>{

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Double[] arr= {1.1,22.2,35.3,41.4,5.5};
		
		selectionSort(arr, new Solution02<>());
		
		for(double e:arr)
		{
			System.out.println(e+" ");
		}
	}

	@Override
	public int compare(Number obj1,Number obj2) {
		if(obj1.doubleValue()>obj2.doubleValue())
			return 1;
		else if(obj1.doubleValue()<obj2.doubleValue())
			return -1;
		return 0;
	}

}
