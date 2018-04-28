// Basic Quick Sort
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		int l=arr.length;
		QuickSort qc=new QuickSort();
		qc.sortQuick(arr,0,l-1);
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
	}
	
	void sortQuick(int[] arr, int start, int end)
	{		
		if(start<end)
		{
		int use=partition(arr,start,end);
		sortQuick(arr, start,use-1);
		sortQuick(arr,use+1,end);
		}
		
		//System.out.println(use);
		
	}
	
	int partition(int[] arr, int start, int end)
	{
		int i=start-1;
		int j=start;
		int temp=0;
		int pivot=arr[end];
		for(;j<=end-1;j++)
		{
			if(pivot>=arr[j])
			{
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;				
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		
		return i+1;
		
	}

}
