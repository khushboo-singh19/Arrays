// Question 6: Largest Sum Contiguous Subarray
//Write an efficient C program to find the sum of 
//contiguous subarray within a one-dimensional array of 
//numbers which has the largest sum.

public class ContiguousSum {

	public static void main(String[] args) {
		int[] ar={-2, -3, 4, -1, -2, 1, 5, -3};
		ContiguousSum cs=new ContiguousSum();
		int sum = cs.maxContiguousSum(ar);
		System.out.println(sum);

	}

	int maxContiguousSum(int[] arr)
	{
		int max_till_now=0, max_now=0;
		for(int i=0;i<arr.length;i++)
		{
			max_now = max_now + arr[i];
			
			if(max_now<0) max_now=0;
			else if(max_now > max_till_now) max_till_now=max_now;
		}
		return max_till_now;
	}
}
