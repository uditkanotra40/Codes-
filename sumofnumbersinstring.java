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
	        String str=sc.next();
	        System.out.println(stringsum(str));
	    }
		//code
	}
	
	static int stringsum(String str)
	{
	    str=str+" ";
	    String s="";
	    int n=str.length();
	    int sum=0;
	    for(int i=0;i<n;i++)
	    {
	        char ch=str.charAt(i);
	        if(Character.isDigit(ch))
	        {
	            s+=ch;
	        }
	        else if(s.length()>0)
	        {
	            sum+=Integer.parseInt(s);
	            s="";
	        }
	        //if()
	        
	    }
	    return sum;
	}
}
