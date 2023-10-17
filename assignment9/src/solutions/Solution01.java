package solutions;

public class Solution01{
	
	static <T extends Number> T findMin(T[] arr)
	{	
		T min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].doubleValue()<min.doubleValue())
			{
				min=arr[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		
		Integer arr[]= {11,22,-1};
		int ans=findMin(arr);
		
		System.out.println(ans);

	}

}
