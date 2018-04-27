
public class CountTriangles {

	public static void main(String[] args)
	{
		int[] arr={10, 21, 22, 100, 101, 200, 300};
		int res=countNoOfTriangles(arr);
		System.out.println(res);
	}
	
	static int countNoOfTriangles(int[] arr)
	{
		int var=0;
		
		int count=0;
		int l=arr.length;
		sort(arr,0,l);
		for(int i=0;i<l-2;i++)
		{
			
		}
		return count;
	}
	
	static void sort(int[] arr, int e, int l)
	{
		int mid=(e+l)/2;
		
	}
}
