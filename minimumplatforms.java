import java.io.*;
import java.util.*;

public class Solution {
    
    
    static int platforms(int[] arrival,int[] depart,int n)
    {
        Arrays.sort(arrival);
        Arrays.sort(depart);
        int inuse=0;
        int max=0;
        int i=0;
        int j=0;
        while(i<n && j<n)
        {
            if(arrival[i]<depart[j])
            {
                inuse++;
                if(inuse>max)
                {
                    max=inuse;
                }
                i++;
            }
            else
            {
                inuse--;
                j++;
            }
                
        }
        return max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t--!=0)
        {
            int n=sc.nextInt();
            int arrival[]=new int[n];
            
            int depart[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arrival[i]=sc.nextInt();
                depart[i]=sc.nextInt();
            }
        
            System.out.println(platforms(arrival,depart,n));
        }
    }
}
