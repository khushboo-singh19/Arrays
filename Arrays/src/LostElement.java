//Question 154 : Find lost element from a duplicated array
//Given two arrays which are duplicates of each other except one element, 
//that is one element from one of the array is missing, 
//we need to find that missing element.

public class LostElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {4, 1, 5, 9, 7};
	    int arr2[] = {7, 5, 9, 4};
	    int lost=findLostElement(arr1,arr2);
	    System.out.println("Lost Element:" + lost);
	}
	
	static int findLostElement(int[] arr1, int[] arr2)
	{
		int res=0;
		for(int i=0; i<arr1.length; i++)
		{
			res=res^arr1[i];
		}
		for(int j=0; j<arr2.length; j++)
		{
			res=res^arr2[j];
		}
		return res;
	}

}
