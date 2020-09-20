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
	        long n=sc.nextLong();
	        System.out.println(threedivisors(n));
	    }
		//code
	}
	
	static boolean isprime(long n)
	{
	    for(long i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	        
	    }
	    return true;
	}
	
	static long threedivisors(long n)
	{
	    long count=1;
	    if(n<4)
	    {
	        return 0;
	    }
	    
	    for(long j=3;j*j<=n;j+=2)
	    {
	        if(isprime(j))
	        {
	            count++;
	        }
	        
	    }
	    return (int)count;
	    
	    
	}
}
