
public class MaximumElement {
	
	
	static int findMaximum(int[] arr, int low, int high)
	{
		if(low==high) return arr[low];
		
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) return arr[mid];
		if(arr[mid]>arr[mid+1]&& arr[mid]<arr[mid-1]) return findMaximum(arr,low,mid-1);
		if(arr[mid]<arr[mid+1]&& arr[mid]>arr[mid-1]) return findMaximum(arr,mid+1,high);
		return 0;
	}
	
	public static void main (String[] args) 
    {
		int arr[] = {1, 3,4,5,6,7, 8,50, 10, 9, 7, 6};
        int n = arr.length;
        System.out.println("The maximum element is "+ 
                            findMaximum(arr, 0, n-1));
    }

}
