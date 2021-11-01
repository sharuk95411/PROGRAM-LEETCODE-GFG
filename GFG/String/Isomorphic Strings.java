 public static boolean areIsomorphic(String s,String t)
    {
        // Your code here
         // Ek Bar Question Youtube se smjh lena then strt krna
        if(s.length()!=t.length()) return false;
        if(s.length()==0 || t.length()==0) return false;          

        else
        {
            HashMap<Character,Character>h1= new HashMap<>();
            HashMap<Character,Boolean>h2= new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char c1= s.charAt(i);
                char c2= t.charAt(i);
                if(h1.containsKey(c1)==true)
                {
                    if(h1.get(c1)!=c2)
                
                    return false;
                }
                else if(h2.containsKey(c2) ==true) 
                {
                    return false;
                }
                else
                {
                    h1.put(c1,c2);
                    h2.put(c2,true);
                }
                
            }
        }
        return true;
        
    }