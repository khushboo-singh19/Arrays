//Question 24 : Find common elements in three sorted arrays
//Given three arrays sorted in non-decreasing order, 
//print all common elements in these arrays.

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {1, 5, 10, 20, 40, 80};
	    int ar2[] = {6, 7, 20, 80, 100};
	    int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	    findCommonElements(ar1,ar2,ar3);

	}

	static void findCommonElements(int[] ar1, int[] ar2, int[] ar3)
	{
		int l=ar1.length, m=ar2.length, n=ar3.length;
		int j=0,k=0,i=0;
		while(i<l && j<m && k<n)
		{
			if(ar1[i]==ar2[j]&&ar1[i]==ar3[k])
			{
				System.out.println(ar1[i]);
				i++;
				j++;
				k++;
			}
			else
			{
			if(ar2[j]<ar1[i]) j++;
			else{
			if(ar3[k]<ar1[i]) k++;
			else
				i++;
			}
			}
		}
	}
}
