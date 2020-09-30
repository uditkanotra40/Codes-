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
	        List<String> strs=new ArrayList<>();
	        permute(str,0,str.length()-1,strs);
	        Collections.sort(strs);
	        for(String ele:strs)
	        {
	            System.out.print(ele+" ");
	        }
	        System.out.println();
	    }
	    
		//code
	}
	
	
	static void permute(String s,int left,int right,List<String> strs)
	{
	    if(left==right)
	    {
	        strs.add(s);
	        return;
	    }
	    else
	    {
	        for(int i=left;i<=right;i++)
	        {
	            String str=swap(s,left,i);
	            permute(str,left+1,right,strs);
	        }
	    }
	}
	
	static String swap(String s,int i,int j)
	{
	    char temp;
	    char arr[]=s.toCharArray();
	    temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	    return String.valueOf(arr);
	}
}
