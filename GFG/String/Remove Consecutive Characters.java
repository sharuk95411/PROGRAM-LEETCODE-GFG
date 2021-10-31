 public String removeConsecutiveCharacter(String s){
        
        
          int l= s.length();
          String ans=A(0,l,s,"");
          return ans;
    }
    
    private String A(int i,int end,String s,String ans)
    {
        
        if(i==end) return ans;
        
        while(i<end-1 && s.charAt(i)== s.charAt(i+1))
        {
            i++;
        }
         
         return A(i+1,end,s,ans+s.charAt(i));
    }