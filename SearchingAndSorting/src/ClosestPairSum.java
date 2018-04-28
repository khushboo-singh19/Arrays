//Question 25 : Given a sorted array and a number x, find the pair in array whose sum is closest to x

public class ClosestPairSum {
	public static void main(String[] args)
	{
		int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54;
		printClosest(arr,x);
	}

	static void printClosest(int[] arr, int x)
	{
		int l=arr.length-1, r=0;
		int res_l=0, res_r=0;
		int diff=(Integer.MAX_VALUE);
		
		while(l>r)
		{
			if(Math.abs(arr[r]+arr[l]-x)<diff)
			{
				diff=Math.abs(arr[r]+arr[l]-x);
				res_l=l; res_r=r;							
			}
			if(arr[r]+arr[l]>x) l--;
			else
				r++;			
		}
		System.out.println(arr[res_l]+", "+arr[res_r]);
	}
}
