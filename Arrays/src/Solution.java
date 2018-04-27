import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static String secureChannel(int operation, String message, String key) {
        
        if(message==null|| message==" " )
        {
        	return "-1";
        }
    if(operation ==1)
    {
    	StringBuilder res=new StringBuilder();
        int m=0;
        int k=0;
        while(m<=message.length()-1)
        {
        Character msg= message.charAt(m); 
        int key1=0;
        if(key.length()>k)
        {
        key1=Integer.parseInt((key.substring(k,k+1)));
        }
        
        res.append(msg);
        for(int i=0;i<key1-1;i++)
        {
            res.append(msg);
        }
            m++;
            k++;
    }
        return res.toString();
    }
    if(operation ==2)
    {
    	int m=0;
    	int k=0;
    	int index=0;
    	Character[] res=new Character[message.length()];
    	while(m<message.length())
    	{
    		int key1=0;
            if(key.length()>k)
            {
            key1=Integer.parseInt((key.substring(k,k+1)));
            }
            res[index++]=message.charAt(m);
            m=m+key1;
            k++;
    	}
    	return res.toString();
    }
    else{
    	return "-1";
    }
      
    }
public static void main(String[] arg)
{
	String s= Solution.secureChannel(1,"Open", "123");
	System.out.println(s);
	String s1= Solution.secureChannel(2,"Oppeeen", "123");
	System.out.println(s);
}
}