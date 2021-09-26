  // Agr tmhe String k sath khelna h to tmhe StringBuilder class k bare me pta hna chahiye bcz string se related sare kam usme de rkhe h .
    // Logic self and 96% Acceptence Rate
    public String reverseParentheses(String s) {
        Stack<String>stack= new Stack<>();
        StringBuilder str= new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            
            if(c==')')
            {
                while(stack.size()>0 && stack.peek().equals("(")==false)
                {
                            // System.out.println(stack.peek());
                    str= str.insert(0,stack.pop());
                }
                  stack.pop();
               
                stack.push(str.reverse().toString());
                str= new StringBuilder();
            }
            else
            {
              stack.push(Character.toString(c));
            }
        }
      
        while(stack.size()>0)
        {
            str= str.insert(0,stack.pop());
        }
        return str.toString();
        
    }