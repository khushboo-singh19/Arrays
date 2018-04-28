
public class LargestSumSubsequence {
	
	public static void main(String args[])
	{
		int[] arr = {1, 101, 2, 3, 100, 4, 5};
		LargestSumSubsequence s=new LargestSumSubsequence();
		int res = s.findLargestSum(arr);
		System.out.println(res);
	}

	private int findLargestSum(int[] arr) {
		int l=arr.length;
		int[] res=new int[l];
		res[0]=arr[0];
		for(int i=0; i<l; i++)
		{
			res[i]=arr[i];
		}
		for(int i=1; i<l; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(arr[i]>arr[j]&&res[i]<res[j]+arr[i])
					res[i]=res[j]+arr[i];
			}
		}
		int max_sum=0;
		for(int i=0; i<l; i++)
		{
			if(res[i]>max_sum) max_sum=res[i];
		}
		return max_sum;
	}
}
