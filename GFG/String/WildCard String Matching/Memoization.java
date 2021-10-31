class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][]= new Boolean[s.length()+1][p.length()+1];
        return A(s,0,p,0,dp);
    }
    
    private boolean A( String s,int i,String pattern,int j,Boolean dp[][])
    {       
        if(j==pattern.length() && i==s.length()) return true;
       
        if(i==s.length() && j!=pattern.length())
        {
            for(int index=j;index<pattern.length();index++)
            {
                if(pattern.charAt(index)!='*') return false;
            }
            return true;
        }
    if(j==pattern.length() && i!=s.length()) return false;
    
    
    boolean ans = false;
        if(dp[i][j]!=null) return dp[i][j];
    
    if(pattern.charAt(j)=='?')
    {
        if(A(s,i+1,pattern,j+1,dp))
            ans= true;
    }
    else if(pattern.charAt(j)=='*')
    {
        if(A(s,i,pattern,j+1,dp)) ans= true;
        if(A(s,i+1,pattern,j,dp)) ans= true;
        if(A(s,i+1,pattern,j+1,dp)) ans= true;
        
    }
        else
        {
    if(s.charAt(i)==pattern.charAt(j))
    {
         if(A(s,i+1,pattern,j+1,dp)) ans=true;
    }
        }
        dp[i][j]= ans;
    
    return ans;
    }    
}