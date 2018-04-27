//Question 33 : Find duplicates in O(n) time and O(1) extra space | Set 1
//Given an array of n elements which contains elements from 0 to n-1, 
//with any of these numbers appearing any number of times. 
//Find these repeating numbers in O(n) and using only constant memory space.
//
//For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, 
//the answer should be 1, 3 and 6.

import java.lang.Math;
public class FindDuplicates {

	public static void main(String[] args) {
		int[] a={1,2,3,1,3,6,6};
		findDuplicates(a);

	}
	
	static void findDuplicates(int[] a)
	{
		for(int i=0; i<a.length;i++)
		{
		if(a[Math.abs(a[i])]<0)
		{
			System.out.println(Math.abs(a[i]));
		}
		else
			a[Math.abs(a[i])]=-a[Math.abs(a[i])];
		}
	}

}
