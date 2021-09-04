// is Question me kai sari chze sikhne ko mili h and TECHDOSE ka Solution TLE de rha h 
class Solution {
    public int ladderLength(String beginW, String endW, List<String> list) {
        
        if(!list.contains(endW)) return 0;
        HashMap<String,Boolean>h= new HashMap<>();
        for(String s :list)
        {
            h.put(s,false);
        }
        
        Queue<String>q= new LinkedList<>();
        q.add(beginW);
        h.put(beginW, true);
        int length=0;
        
        while(q.size()>0)
        {
            
            int size= q.size();
            for(int i=0;i<size;i++)
            {
                String s= q.poll();
                if(s.equals(endW)) return length+1;
                wordM(s,h,q);
            }
            
        length++; // yhe ye for loop k bhr increase ho rha h andr ni isko ase smjh skte ho 3 path h jo ki size ko bta rhe h ab unhme se min to ek path pr hi milega na 
so hm all path pr jyge but min path only ek path se hi milega islye yha for ke bhr step(length) increase hui h ,ye chz TECHOSE ki vdio me smjh a jygi 
        }
        return 0;
    }
    

        public void wordM(String s,HashMap<String,Boolean>h, Queue<String>q)
        {
            for(int i=0;i<s.length();i++)
            {
                char temp[]= s.toCharArray();
                for(int j=0;j<26;j++)
                {
                    temp[i]= (char)('a'+j);
                    String check= String.valueOf(temp);
                    if(h.containsKey(check) && h.get(check)==false )
                    {
                        h.put(check,true);
                        q.add(check);
                    }
                }
            }
        }
    
}