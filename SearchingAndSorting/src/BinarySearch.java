
public class BinarySearch {
	static int index;
	
	int binarySearch(int[] arr, int l, int r, int res)
	{
		if(l>r) return -1;		
		
		int m=l+(r-l)/2;
		if(arr[m]==res)
		{
			return m;			
		}
		if(res>arr[m]) return binarySearch(arr,m+1,r,res);
		
		else return binarySearch(arr,l,m-1,res);
		
	}
	
	int binarySearchIterative(int[] arr, int res)
	{
		int l=0, r=arr.length;
		int m=0;
		while(l<=r)
		{
		m=l+(r-l)/2;
		if(arr[m]==res)
		return m;
		if(res>arr[m]) l=m+1;
		else r=m-1;
		}
		return -1;
	}
	
	
	
	public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,20,40};
        int n = arr.length;
        int x = 15;
        int result = ob.binarySearch(arr,0,n-1,x);
        int result2 = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);
        
        if (result2 == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);
    }

}
