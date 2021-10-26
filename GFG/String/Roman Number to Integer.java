public int romanToDecimal(String s) {
        // code here
         HashMap<Character,Integer>h= new HashMap<>();
    h.put('I', 1);
	h.put('V', 5);
	h.put('X', 10);
	h.put('L', 50);
	h.put('C', 100);
	h.put('D', 500);
  	h.put('M', 1000);
  	char ch[]= s.toCharArray();
        
        int ans=0;
        for(int i=0;i<ch.length;i++)
        {
            if(i!=ch.length-1 && h.get(ch[i])<h.get(ch[i+1]))
            {
                ans= ans+h.get(ch[i+1])-h.get(ch[i]);
                i++;
            }
            else
            {
                ans= ans+h.get(ch[i]);
            }
          
            
        }
        return(ans);
    }