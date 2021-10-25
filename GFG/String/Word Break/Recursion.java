// logic Naresh Gupta and easy Logic h
// Hint- All Possible SubString me break kr do then check kro each substring ko simple
class Solution {
    public boolean wordBreak(String s, List<String> l) {
         if(l.contains(s))
        {
            return true;
        }
         for(int i=1;i<=s.length();i++)
        {
        String prefix= s.substring(0,i);
        if(l.contains(prefix) && wordBreak(s.substring(i),l))
        {
        return true;
        }
       
  
    }
  return false;
        
    }
}