import java.util.*;
public class Practice {
	public static void main(String args[])
	{
		int[][] prefer = { {7, 5, 6, 4},
		        {5, 4, 6, 7},
		        {4, 5, 6, 7},
		        {4, 5, 6, 7},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		        {0, 1, 2, 3},
		    };
		stableMarriage(prefer);		
	}
	
	static void stableMarriage(int[][] prefer)
	{
		int n=prefer.length/2;
		HashMap<Integer,Integer> pair=new HashMap<Integer,Integer>();
		for(int i=n-1;i<2*n-1;i++)
		{
			pair.put(i, null);
		}
		while(pair.containsValue(null))
		{
			
		}
	}

}
