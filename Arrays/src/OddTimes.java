// Question 5 : Find the Number Occurring Odd Number of Times
public class OddTimes {

	public static void main(String[] args) {
		int[] arr={1,2,3,66,3,8,66,2,1};
		OddTimes o=new OddTimes();
		int n=o.occursOddTimes(arr);
		System.out.println(n);
		

	}
	
	int occursOddTimes(int[] arr)
	{
		int s=0;
		for(int i=0; i<arr.length; i++)
		{
			s=s^arr[i];
		}
		return s;
	}

}
