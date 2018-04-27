
public class StableMarriage {
	
	public static void main(String args[])
	{
		int[][] prefer = { {4, 5, 6, 7},
		        {5, 4, 6, 7},
		        {4, 5, 6, 7},
		        {4, 5, 6, 7},
		        {3, 1, 2, 0},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		    };
		    stableMarriage(prefer);
	}
	static void stableMarriage(int[][] prefer)
	{
		int n= prefer.length /2;
		int[] wPartner=new int[n];
		boolean[] mFree=new boolean[n];
		for(int i=0;i<n;i++)
		{
			wPartner[i]=-1;
			mFree[i]=false;
		}

		int free=n;
		while(free>0)
		{
			int m;
			for(m=0;m<n;m++)			
				if(mFree[m]==false)
					break;
			for(int k=0;k<n && mFree[m]==false;k++)
			{
				int w=prefer[m][k];
				if(wPartner[w-n]==-1)
				{
					wPartner[w-n] =m;
					mFree[m]=true;
					free--;
					
				}
				else
				{
					int m1=wPartner[w-n];
					if(willSheChoose_m_over_m1(prefer,m,m1,n,w))
					{
						wPartner[w-n]=m;
						mFree[m]=true;
						mFree[m1]=false;
						
					}
					
				}
			}
			
		}
		for(int l=0;l<n;l++)
		{
			System.out.println((l+n)+" "+wPartner[l]);
		}
	}
	
	static boolean willSheChoose_m_over_m1(int[][] prefer, int m, int m1, int n, int w)
	{
		for(int j=0;j<n;j++)
		{
			if(prefer[w][j]==m)
			{
				return true;
			}
			if(prefer[w][j]==m1) 
				return false;
		}
		return false;
		
	}

}
