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
	        jumping(n);
	    }
		//code
	}
	
	static void jumping(int n)
	{
	    Queue<Integer> queue=new LinkedList<>();
	    System.out.print("0 "); 
	    for(int i=1;i<=9;i++) //loop starts from one as we do not need leading zeros
	    {
	        queue.offer(i);
	    }
	        while(!queue.isEmpty())
	        {
	            int temp=queue.poll();
	            if(temp>n)
	            {
	                continue;
	            }
	            System.out.print(temp+" ");
	            int leftmost=temp%10;
	            if(leftmost>0)
	            {
	                queue.add(temp*10+(leftmost-1));
	            }
	            if(leftmost<9)
	            {
	                queue.add(temp*10+(leftmost+1));
	            }
	        }
	    
	    System.out.println();
	}
}
