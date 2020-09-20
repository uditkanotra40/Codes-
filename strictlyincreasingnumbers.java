/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static void sia(int n,int prev,String s)
    {
        if(n==0)
        {
            System.out.print(s+" ");
        }
        
        for(int i=prev;i<10;i++)
        {
            sia(n-1,i+1,s+String.valueOf(i));
        }
    }
    
    
    
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        int n=sc.nextInt();
	        String s="";
	        sia(n,1,s);
	        System.out.println();
	    }
		//code
	}
}
