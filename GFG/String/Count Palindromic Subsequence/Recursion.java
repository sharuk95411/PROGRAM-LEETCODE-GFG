// logic from Code Library
int ans=0;
    long countPS(String str)
    {
        
         ans= A(str,0,str.length()-1);
        return ans;
    }
    
    private int A(String str,int i,int j)
    {
        if(i==j) return 1;
        if(i>j) return 0;
        
        if(str.charAt(i)==str.charAt(j))
        {
            ans= 1+ A(str,i+1,j) +A(str,i,j-1);
        }
        else 
        
         return A(str,i+1,j)+A(str,i,j-1)- A(str,i+1,j-1);
        return ans;
    }