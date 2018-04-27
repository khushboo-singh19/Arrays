/*You are given an array of n integers which can contain integers from 1 to n only . 
 * Some elements can be repeated multiple times and some other elements can be absent from the array . 
 * Write a running code on paper which takes O(1) space apart from the input array and O(n) time 
 * to print which elements are not present in the array and the count of every element 
 * which is there in the array along with the element number .
 */
public class RepeatingInAnArray {

public static void main(String args[])
{
int arr[] = {6,4,1,4,3,2,5,2,1};
int res[]= getCount(arr);
for(int i=0; i<arr.length;i++)
{
	System.out.println((i+1)+" "+-arr[i]);
}
}
static int[] getCount(int[] arr)
{
	int pos=0, desiredPos=0;
	int n=arr.length;
	int temp=0;
	while(pos<n)
	{
		if(arr[pos]==0)
		{
			pos++;
		}
		else{
	if(arr[pos]<0)
	{
	pos++;	
	}
	
	else
	{
		desiredPos=arr[pos]-1;
		if(arr[desiredPos]<0 && desiredPos >0)
		{
			--arr[desiredPos];
			arr[pos]=0;
			pos++;
		}
		else
		{
			arr[pos]=arr[desiredPos];
			arr[desiredPos]=-1;
			if(arr[pos]<0)
			{
			pos++;
			}
		}
		
	}
		}
	}
	return arr;
}
}
