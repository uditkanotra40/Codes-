class Solution {
    public int[][] transpose(int[][] A) 
    {
        int[][] ans=new int[A[0].length][A.length];
        if(A==null || A.length==0)
        {
            return ans;
        }
       
        for(int i=0;i<A[0].length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                ans[i][j]=A[j][i];
            }
        }
        return ans;
        
    }
}
