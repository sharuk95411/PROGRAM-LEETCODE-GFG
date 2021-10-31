// Logic -Pepcoding  (Leetcode 49)
// Good question isme HashMap of HashMap use krna sikha h  this is BFA and isko optimise krna bcha h pehle ye khd se try krna then optimise krna sikhna.
// HashMap me value key k base pr sort hokr store hti h and isme character k base pr sort hgi so yhi property ka use hua h
class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
    HashMap<HashMap<Character, Integer>, List<String>>h1= new HashMap<>();
    for(String str: s)
    {
        HashMap<Character,Integer>h2= new HashMap<>();
        
        for(int j=0;j<str.length();j++)
        {
            char ch=str.charAt(j);
       h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(h1.containsKey(h2)==true)
        {
            List<String>l= h1.get(h2);
            l.add(str);
            
        }
        else
        {
            List<String>l= new ArrayList<>();
            l.add(str);
            h1.put(h2,l);
        }
        }
        
    List<List<String>>L= new ArrayList<>();
    for(List<String>l : h1.values())  // yha only values ko traverse kr rhe h ye b nai chz h 
    {
        L.add(l);
    }
    return L;
    
    }
}