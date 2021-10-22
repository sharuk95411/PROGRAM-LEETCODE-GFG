//Easy Question h Logic Pepcoding isme Rec Tree important h agr wo smjh a gya to uske base pr hi code easily likh loge.


class Solution {
    
    List<String>list= new ArrayList<>();
    public List<String> find_permutation(String S) {
        
        char ch[]= S.toCharArray();
        Arrays.sort(ch);
        String s= new String(ch);
        A(s,"");
        return list;
    
    }
    
    private void A( String s,String ans)
    {
        if(s.length()==0 )
        {
            list.add(ans);
        
        }
        for(int i=0;i<s.length();i++)
        {
           char a= s.charAt(i);
            String left= s.substring(0,i);
            String right= s.substring(i+1);
            String add= left+right;
            A(add,ans+a);
        }
    }
}