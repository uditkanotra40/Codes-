import java.util.*;
class main
{
    
    static int atmost(int[] arr,int n,int k)
    {
        int count=0;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum+arr[i]<=k)
            {
                sum+=arr[i];
                count++;
            }
            else if(sum!=0)
            {
                sum=sum-arr[i-count]+arr[i];
            }
            max=Math.max(max,count);
        }
        return max;
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(atmost(arr,n,k));
    }
}
