class Solution {
    int count=0;
     String f="";
    public String getPermutation(int n, int k) {
        
         String s="";
        for(int i=1;i<=n;i++)
        {
            s=s+String.valueOf(i);
        }
        
          B(s,"",k);
        return f;
    }
     public boolean B(String s,String ans,int k)
    {
        if(s.length()==0 )
          {
              count++;
              if(count==k)
              {
                  f=ans;
                  return true ;
              }
            
              return false;
          }
         
         
    

        for(int i=0;i<s.length();i++)
           {
            
           char c= s.charAt(i);
           String left=s.substring(0,i);
           String right= s.substring(i+1);
              if(B(left+right,ans+c,k))
                  return true;
          
         
        }
         return false;
}
}