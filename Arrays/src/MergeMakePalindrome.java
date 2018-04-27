
public class MergeMakePalindrome {
	
	public static void main(String args[])
	{
		int arr[] = {11, 14, 15,14, 11};
		int n=findNoOfSteps(arr, 0, arr.length-1);
		System.out.println(n);
	}
	
	static int findNoOfSteps(int[] arr, int i, int j)
	{
		int count=0;
		while(i!=j)
		{
			
			if(arr[i]==arr[j])
			{
				i++; j--;
			}
			
		if(arr[i]>arr[j])
		{
			arr[j-1]=arr[j]+arr[j-1];
			count++;
			j--;
			
		}
		if(arr[j]>arr[i])
		{
			arr[i+1]=arr[i]+arr[i+1];
			count++;
			i++;
			
		}
		
		}
		return count;
	}

}
