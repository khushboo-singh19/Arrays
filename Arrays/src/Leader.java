//Question 16: Leaders in an array
//Write a program to print all the LEADERS in the array. 
//An element is leader if it is greater than all the elements 
//to its right side. And the rightmost element is always a leader. 
//For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

public class Leader {

	public static void main(String[] args) {
	    int arr[] = {16, 17, 4, 3, 5, 2};
	    Leader l=new Leader();
	    l.printLeader(arr);
	}
	void printLeader(int[] arr)
	{
		int max_now = arr[arr.length-1];
		int max_till_now = arr[arr.length-1];	
		System.out.println(max_till_now);
		for(int i=arr.length-1; i>=0; i--)
		{			
			if(arr[i]>max_now)
			{
				max_now=arr[i];
				System.out.println(max_now);
			}
			
//			if(max_till_now!= max_now)
//			{
//				max_till_now=max_now;
//				System.out.println(max_till_now);
//			}
		}
	}
}
