
public class MinDistanceBetweenNumbers {
public static void main(String[] args)
{
	int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
    
    int x = 3;
    int y = 6;
    
    int d=minDistance(arr,x,y);
    System.out.println(d);
}

static int minDistance(int[] arr, int x, int y)
{
	int min_dist=Integer.MAX_VALUE;
	int prev=0;
	int i;
	for(i=0; i<arr.length; i++)
	{
	if(arr[i]==x||arr[i]==y)
	{
		prev=i;
		break;
	}
	}
	for(;i<arr.length; i++)
	{
		if(arr[i]==x||arr[i]==y)
		{
			if(arr[prev]!=arr[i] && min_dist > (i-prev))
			{
				min_dist=i-prev;
				prev=i;
			}
			else
				prev=i;
		}
	}
	return min_dist;
}
}
