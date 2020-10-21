
public class Solution {
    public int solve(int[][] A) 
    {
        
        // 000000
        // for test cases like above
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i][0]==1);
            {
                ans=1;
                break;
            }
        }
        
        for(int i=0;i<A[0].length;i++)
        {
            if(A[0][i]==1);
            {
                ans=1;
                break;
            }
        }
        
        
        
        for(int i=1;i<A.length;i++)
        {
            for(int j=1;j<A[0].length;j++)
            {
                if(A[i][j]!=0)
                {
                    A[i][j]=Math.min(A[i-1][j-1],Math.min(A[i-1][j],A[i][j-1]))+1;
                    ans=Math.max(ans,A[i][j]);
                }
            }
        }
        return ans*ans;
    }
}
