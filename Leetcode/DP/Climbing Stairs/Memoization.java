class Solution {
    int count =0;
     
    
    public int climbStairs(int n) {
        
        int dp[]= new int[n+1];
        return A(n,0,dp);  
    }
    
    private int A(int n,int sum,int dp[])
    {
        if(sum==n)
        {
        
            return 1 ;
        } 
        if(sum>n) return 0;
        if(dp[sum]>0) return dp[sum];
    
       dp[sum]= A(n,sum+1,dp)+A(n,sum+2,dp);
        
        return dp[sum];
    
    }
}