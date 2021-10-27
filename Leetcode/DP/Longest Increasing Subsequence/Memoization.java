 // Iske Memoization kuch alg h so isme ye b trika pta chl gya memoization ka
    public int lengthOfLIS(int[] nums) {
        
        int dp[][]= new int[nums.length][nums.length];
        return A(nums,-1,0,dp);
    }
    
    private int A(int nums[],int prev,int curr,int dp[][])
    {
        if(curr==nums.length) return 0;
        
        if(prev!=-1 && dp[prev][curr]!=0) return dp[prev][curr];
        
        int a1=0;
        
        if(prev==-1 || nums[curr]>nums[prev])
        {
            a1= 1+A(nums,curr,curr+1,dp);
        }
        int a2= A(nums,prev,curr+1,dp);
     
        if(prev!=-1)
        {
            dp[prev][curr]= Math.max(a1,a2);
        }
        
        return Math.max(a1,a2);
    }