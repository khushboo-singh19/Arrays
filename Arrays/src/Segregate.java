// Question 23 : Segregate 0s and 1s in an array
public class Segregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 0, 1, 1, 1};
		Segregate s = new Segregate();
		s.segragate0and1(arr);

	}
	
	void segragate0and1(int[] arr)
	{
		int left=0, right=arr.length-1;
		while(left<right)
		{
			if(arr[left]==0)
				left++;
			if(arr[right]==1)
				right--;
			
			if(arr[left] == 1 && arr[right]==0)
			{
				arr[left]=arr[right];
				arr[right]=1;
				left++;
				right--;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
