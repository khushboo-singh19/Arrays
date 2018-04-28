
public class LongestCommonSubsequence {
	
	public static void main(String[] args)
	  {
	    LongestCommonSubsequence lcs = new LongestCommonSubsequence();
	    String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	 
	    System.out.println("Length of LCS is" + " " +
	                                  lcs.lcs( X, Y, m, n ) );
	  }
	
	public int lcs(char[] s1, char[] s2, int m, int n)
	{
		int[][] res=new int[m+1][n+1];
		
		for(int i=0; i<=m; i++)
		{
			for(int j=0; j<=n; j++)
			{
				if(i==0||j==0)
					res[i][j]=0;
				else
					if(s1[i-1]==s2[j-1])
					res[i][j]= 1+ Math.max(res[i-1][j], res[i][j-1]);
				else
					res[i][j]= Math.max(res[i-1][j], res[i][j-1]);
			}
		}
		return res[m][n];		
	}
}
