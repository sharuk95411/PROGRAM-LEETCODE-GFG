// Hint-isme sari possibilities ko lekr unka min kia gya h bcz tmhe ni pta kis possiblity se ans kya ayga so simple sari possibilities le lo
// TLE occur

class Solution {
    int count=0;
    public int editDistance(String s, String t) {
        // Code here
      
       return A(s,t); 
        
    }
    
    private int A(String s,String t)
    {
        if(s.length()==0) return t.length();
        if(t.length()==0) return s.length();
        if(s.charAt(0)==t.charAt(0)) 
        {
            return A(s.substring(1),t.substring(1));
        }
        else
        {
            count= 1+ Math.min(A(s.substring(0),t.substring(1)),
       Math.min(A(s.substring(1),t.substring(0)),A(s.substring(1),t.substring(1)))) ;
        }
        return count;
    }
    
}