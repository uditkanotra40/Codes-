class Solution {
    public int countPrimes(int n) 
    {
        if(n==0 || n==1)
        {
            return 0;
        }
        List<Integer> nums=new ArrayList<>();
        
        boolean primes[]=new boolean[n+1];
        primes[0]=false;
        primes[1]=false;
        
        for(int i=2;i<n;i++)
        {
            primes[i]=true;
        }
        
        for(int i=2;i*i<n;i++)
        {
            if(primes[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    primes[j]=false;
                }
            }
        }
        
        for(int i=2;i<n;i++)
        {
            if(primes[i]==true)
            {
                nums.add(i);
            }
        }
        
        return nums.size();
        
    }
}
