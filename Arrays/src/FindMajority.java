
public class FindMajority {
	
	public static void main(String args[])
	{
		int arr[]={1,1,2,2,1,1,3,3,1,1,1,4,4,5,1,1,5,1,1,6,6};
		int size=arr.length;
		int maj=findMajority(arr,size);
		System.out.println(maj);
		
		int arr1[]={1,1,2,2,6};
		int size1=arr1.length;
		int maj1=findMajority(arr1,size1);
		System.out.println(maj1);
	}

	private static int findMajority(int[] arr, int size) {
		int maj_ind=0;
		int count=1;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==arr[maj_ind])
			{
				maj_ind=i;
				count++;
			}
			else
			{
				if(count!=0)
				{
					count--;					
				}
				else
				{
					maj_ind=i;
					count=1;
				}
			}
		}
		int count_final=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]==arr[maj_ind])
			{
				count_final++;
			}
		}
		
		if(count_final>size/2)
		{
			return arr[maj_ind];
		}
		return -1;
	}

}
