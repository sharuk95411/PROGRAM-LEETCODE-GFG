class Solution
{
    
    long countPS(String str)
    {
         Long dp[][]= new Long[1001][1001];
          Long ans= A(str,0,str.length()-1,dp);
          if(ans<0) return ans+ 1000000007;
          else return ans % 1000000007;
        
         //return ans;
    }
    
    private Long A(String str,int i,int j,Long dp[][] )
    {
        if(i==j) return 1L;
        if(i>j) return 0L;
        
        if(dp[i][j]!=null) return dp[i][j];
        if(str.charAt(i)==str.charAt(j))
        {
            return dp[i][j]= (1+ (A(str,i+1,j,dp) +A(str,i,j-1,dp)) % 1000000007) % 1000000007;
        }
        else 
        
        return dp[i][j]=(( A(str,i+1,j,dp)+A(str,i,j-1,dp)) % 1000000007- A(str,i+1,j-1,dp)) % 1000000007;
       
    }
}