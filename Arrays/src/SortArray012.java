
public class SortArray012 {
	
	static void sort012(int[] arr)
	{
		int lo=0,hi=arr.length-1,mid=0;
		int var=0;
		while(mid<=hi)
		{
		if(arr[mid]==0)
		{
			var=arr[lo];
			arr[lo]=0;
			arr[mid]=var;
			lo++;
			mid++;
		}
		else{
		if(arr[mid]==1&&mid<arr.length)
		{					
			mid++;
		}
		else
		{
			var=arr[hi];
			arr[hi]=2;
			arr[mid]=var;
			hi--;
		}
		}
		}
	}
	
	static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main (String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr);
        System.out.println("Array after seggregation ");
        printArray(arr);
    }

}
