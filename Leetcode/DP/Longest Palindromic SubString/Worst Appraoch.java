// TC O(n3) 
// isme sare possible substrings one by one le rhe h     
static String longestPalin(String S){
        
    String s="";
    if(S.length()==0) return s;
    s=S.substring(0,1);
    int n= S.length();
    int length=1;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            String sub= S.substring(i,j+1);
            if(isPalindrome(sub))
            {
                if(sub.length()>length )
                {
                    s= sub;
                    length= sub.length();
                }
            }
        }
    }
    return s;
        
    }
    private static boolean isPalindrome(String s)
    {
        
        int i=0;
        int j= s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j) ) return false;
            i++;
            j--;
        }
        return true;
    }