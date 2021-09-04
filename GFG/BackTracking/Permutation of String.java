class Solution {
     
    List<String>l= new ArrayList<>();
    public List<String> find_permutation(String S) {
   char c[]= S.toCharArray();
      Arrays.sort(c);
      String s= new String (c);
   
     return A(s,"");
    
    
    
    }
    
    public List<String> A(String s, String ans)
    {
        if(s.length()==0) 
        {
            l.add(ans);
        
        }
        for(int i=0;i<s.length();i++)
        {
            char a= s.charAt(i);
            String left= s.substring(0,i);
            String right= s.substring(i+1);
            String add= left+right;
            A(add,ans+a);
        }
        return l;
    }
}