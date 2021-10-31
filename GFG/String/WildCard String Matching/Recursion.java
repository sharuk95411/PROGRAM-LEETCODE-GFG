[Notes][Leetcode] Logic-Aburag Codes. isko rec and memoization se kia h vdio dkhkr approach is easy and
 DP se krna bcha h next time pehle khd try krna then Dp se try krna 
class Solution {
    public boolean isMatch(String s, String p) {
        
        return A(s,0,p,0);
    }
    
    private boolean A( String s,int i,String pattern,int j)
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
    
    if(pattern.charAt(j)=='?')
    {
        if(A(s,i+1,pattern,j+1))
            ans= true;
    }
    else if(pattern.charAt(j)=='*')
    {
        if(A(s,i,pattern,j+1)) ans= true;
        if(A(s,i+1,pattern,j)) ans= true;
        if(A(s,i+1,pattern,j+1)) ans= true;
        
    }
        else
        {
    if(s.charAt(i)==pattern.charAt(j))
    {
         if(A(s,i+1,pattern,j+1)) ans=true;
    }
        }
    
    return ans;
    }    
}