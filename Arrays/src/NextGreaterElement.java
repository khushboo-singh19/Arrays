import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) 
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }

	private static void printNGE(int[] arr, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		int i=1;
		int next;
		int top;
		while(i<n && !stack.isEmpty())
		{
			next=arr[i];
			top=stack.peek();
			while(top<next && !stack.isEmpty() && i<n-1)
			{
				System.out.println(stack.pop()+" "+ arr[i]);
				if(!stack.isEmpty())
				top=stack.peek();
			}
			if(top>next)
			{
				stack.push(next);
				i++;				
			}
		}
		while(!stack.isEmpty())
		{
			top=stack.pop();
			System.out.println(top+" "+ -1);
		}
		
	}

}
