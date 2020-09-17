/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int lps(String str)
    {
        char arr1[]=str.toCharArray();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=arr1[i];
        }
        char arr2[]=reverse.toCharArray();
        int dp[][]=new int[arr1.length+1][arr1.length+1];
        int max=0;
        
        for(int i=1;i<=arr1.length;i++)
        {
            for(int j=1;j<=arr2.length;j++)
            {
                if(arr1[i-1]==arr2[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
    
    static int minadd(String str)
    {
        int n=str.length();
        return n-lps(str);
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        String str=sc.next();
	        System.out.println(minadd(str));
	    }
		//code
	}
}
