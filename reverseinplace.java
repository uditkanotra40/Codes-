/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int arr[]={1,2,3,4,5};
		int start=0;
		int end=arr.length-1;
		int mid=arr.length/2;
		
		for(int i=0;i<arr.length/2;i++)
		{
		    int temp=arr[i];
		    arr[i]=arr[arr.length-1-i];
		    arr[arr.length-1-i]=temp;
		}
	
		
		for(int i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
	
	static void swap(int a,int b)
	{
	    int temp=a;
	    a=b;
	    b=temp;
	}
}
