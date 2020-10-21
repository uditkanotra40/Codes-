Use f[i][j] to represent the shortest edit distance between word1[0,i) and word2[0, j). Then compare the last character of word1[0,i) and word2[0,j), which are c and d respectively (c == word1[i-1], d == word2[j-1]):

if c == d, then : f[i][j] = f[i-1][j-1]

Otherwise we can use three operations to convert word1 to word2:

(a) if we replaced c with d: f[i][j] = f[i-1][j-1] + 1;

(b) if we added d after c: f[i][j] = f[i][j-1] + 1;

(c) if we deleted c: f[i][j] = f[i-1][j] + 1;

Note that f[i][j] only depends on f[i-1][j-1], f[i-1][j] and f[i][j-1], therefore we can reduce the space to O(n) by using only the (i-1)th array and previous updated element(f[i][j-1]).


public class Solution {
    public int minDistance(String A, String B) 
    {
        int alength=A.length();
        int blength=B.length();
        
        char Aarr[]=A.toCharArray();
        char Barr[]=B.toCharArray();
        
        // word1[0,i)  word2[0,j)
        
        //Aarr[i-1]==Barr[j-1]
        //dp[i-1]=dp[i-1][j-1]
        int dp[][]=new int[alength+1][blength+1];
        
        for(int i=0;i<=alength;i++)
        {
            dp[i][0]=i;
        }
        
        for(int i=0;i<=blength;i++)
        {
            dp[0][i]=i;
        }
        
        for(int i=1;i<=alength;i++)
        {
            for(int j=1;j<=blength;j++)
            {
                if(Aarr[i-1]==Barr[j-1])
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+min(dp[i-1][j-1],dp[i-1][j],dp[i][j-1]);
                    
                }
            }
        }
        return dp[alength][blength];
    }
    
    static int min(int a,int b,int c)
    {
        int temp=Math.min(a,b);
        return Math.min(temp,c);
    }
    
    // replace dp[i][j]=dp[i-1][j-1]+1;
    // add d after c dp[i][j]=dp[i][j-1]+1;
    // delete c dp[i][j]=dp[i-1][j]+1
}
