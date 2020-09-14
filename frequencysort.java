/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
     static List<Integer> sort(List<Integer> list)
	    {
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<list.size();i++)
	        {
	            if(map.containsKey(list.get(i)))
	            {
	                map.put(list.get(i),map.get(list.get(i))+1);
	            }
	            else
	            {
	                map.put(list.get(i),1);
	            }
	            
	        }
	        
	        Collections.sort(list,(n1,n2)->{
	            int freq1=map.get(n1);
	            int freq2=map.get(n2);
	            
	            if(freq1!=freq2)
	            {
	                return freq2-freq1;
	            }
	            return n1-n2;
	            
	        });
	        return list;
	    }
    
    
	public static void main (String[] args) 
	{
	   
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        List<Integer> list=new ArrayList<>();
	        for(int ele:arr)
	        {
	            list.add(ele);
	        }
	        sort(list);
	        for(int ele:list)
	        {
	            System.out.print(ele+" ");
	        }
	        System.out.println()
	    }
		//code
	}
}
