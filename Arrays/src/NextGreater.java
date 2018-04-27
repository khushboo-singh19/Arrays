import java.util.Stack;

public class NextGreater {
	
	public static void main(String args[])
	{
		int arr[] = { 11, 13, 21, 3 };
		nextGreater(arr);
		
	}

	private static void nextGreater(int[] arr) {
		
		int l=arr.length;
		int i=0;
		Stack<Integer> s=new Stack<Integer>();
		while(i<l-1)
		{
			if(arr[i]<arr[i+1])
			{
				System.out.println(arr[i]+" "+arr[i+1]);
				while(!s.isEmpty())
				{
					if(s.peek()<arr[i+1])
					{
						System.out.println(s.pop()+" "+arr[i+1]);
					}
				}
			}
			else
			{
				s.push(arr[i]);
			}
			i++;
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop()+" "+-1);
		}
		System.out.println(arr[i]+" "+-1);
	}
}
