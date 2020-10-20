/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        int n=sc.nextInt();
	        String strs[]=new String[12];
	        List<String> strslist=new ArrayList<>();
	        for(int i=0;i<n;i++)
	        {
	            strs[i]=sc.next();
	        }
	        for(String ele:strs)
	        {
	            strslist.add(ele);
	        }
	        String sample=sc.next();
	        if(wordbreak(sample,strslist))
	        {
	            System.out.println("1");
	        }
	        else
	        {
	            System.out.println("0");
	        }
	    }
		//code
	}
	
	static boolean wordbreak(String sample,List<String> strslist)
	{
	    int n=sample.length();
	    boolean dp[]=new boolean[n+1];
	    dp[0]=true; // strs.substring(0,0) is empty string which can be broken down
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(dp[j] && strslist.contains(sample.substring(j,i)))
	            {
	                dp[i]=true;
	                break;
	            }
	        }
	    }
	    return dp[n];
	}
}
