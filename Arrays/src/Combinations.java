
public class Combinations {
	static int[][] nCr=new int[10][5];
	public static void main(String args[])
	{
		int res=findCombinations(9,4);
		
		System.out.println(res);
	}

	private static int findCombinations(int n, int r) {
		
//		if(cr[n][r] != -1)
//			return cr[n][r];
		if(r==0||n==r) return 1;		
		
		int ans = (findCombinations(n-1,r)+findCombinations(n-1,r-1)); //% (int)1E9;
		return nCr[n][r] = ans;
	}
}
