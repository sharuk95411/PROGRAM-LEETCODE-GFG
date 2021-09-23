// Logic- Codebix
    // Hint- MonoTonic Increasing stack used
    // TC O(n) and SC O(n)
    public String removeKdigits(String num, int k) {
        
        Stack<Integer>stack= new Stack<>();
        
       char ch[]= num.toCharArray();
        
        int i=0;
        while(i<ch.length)
        {
            int value= ch[i]-'0';
            if(stack.size()>0 &&stack.peek()>value)
            {
                while( stack.size()>0 && (k>0 && stack.peek()>value)  )
                {
                    stack.pop();
                    k--;
                }
                stack.push(value);
                i++;
                
            }
            else
            {
                stack.push(value);
                i++;
            }
                
        }
        while(stack.size()>0 && k>0)
        {
            stack.pop();
            k--;
        }
        StringBuilder str= new StringBuilder();
        while(stack.size()>0)
        {
            str.insert(0,stack.pop());
            
        }
    String ans= str.toString();
        System.out.println(ans);
        i=0;
    while(i<ans.length()&& ans.charAt(i)=='0')
    {
        i++;
    }
        if(i==ans.length()) return "0";
        else
        return (ans.substring(i,ans.length()));
        
    
    }