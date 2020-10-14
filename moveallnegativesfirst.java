/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
	    int m=0;
	    int n=arr.length-1;
	    int j=0;
	    
	    int temp;
		for(int i=0;i<n;i++)
		{
		    if(arr[i]<0)
		    {
		        if(i!=j)
		        {
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		        j++;
		    }
		}
		for(int ele:arr)
		{
		    System.out.println(ele);
		}
	}
}
