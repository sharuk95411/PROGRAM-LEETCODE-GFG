// Naresh Gupta
class Solution {
    Map<String,Boolean> map= new HashMap<>();
    public boolean wordBreak(String s, List<String> l) {
         if(l.contains(s))
        {
            return true;
        }
        if(map.containsKey(s))
            return map.get(s);
         for(int i=1;i<=s.length();i++)
        {
        String prefix= s.substring(0,i);
        if(l.contains(prefix) && wordBreak(s.substring(i),l))
        {
            map.put(s,true);
        return true;
        }
        else map.put(s,false);
  
    }
  return false;
        
    }
}