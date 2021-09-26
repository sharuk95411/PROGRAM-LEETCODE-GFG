class Solution {
     class pair
    {
        char c;
        int freq;
        pair(int freq,char c)
        {
            this.freq=freq;
            this.c=c;
        }
    }
    public String removeDuplicates(String s, int k) {
         Stack<pair>stack= new Stack<>();
       stack.push(new pair(1,s.charAt(0)));
       for(int i=1;i<s.length();i++)
       {
           if(stack.size()>0 && stack.peek().c==s.charAt(i))
           {
               int count=stack.pop().freq;
               stack.push(new pair(count+1,s.charAt(i)));
              
           }
           else
           {
               stack.push(new pair(1,s.charAt(i)));
           }
           if(stack.peek().freq==k)
           {
               stack.pop();
           }
       }
       StringBuilder st= new StringBuilder();
        while(stack.size()>0)
       {
           while(stack.peek().freq>0)
           {
               st.append(stack.peek().c);
               stack.peek().freq--;
           }
           stack.pop();
       }
       
        return(st.reverse().toString());
        
    }
    
}