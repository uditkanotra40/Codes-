/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	static int lpc(String str)
	{
	    int max=0;
	    Stack<Character> stack=new Stack<>();
	    Stack<Integer> index=new Stack<>();
	    index.add(-1);
	    
	    for(int i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)=='(')
	        {
	            stack.add('(');
	            index.add(i);
	        }
	        else
	        {
	            if(!stack.isEmpty() && stack.peek()=='(')
	            {
	                stack.pop();
	                index.pop();
	                max=Math.max(max,i-index.peek());
	            }
	            else
	            {
	                index.add(i);
	            }
	        }
	    }
	    return max;
	}
	
	
	public static void main (String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        String str=sc.next();
	        System.out.println(lpc(str));
	    }
		//code
	}
}
