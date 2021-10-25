 public boolean isValid(String s) {
        
        Stack<Character>stack= new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c==')' || c=='}'|| c==']')
            {
                if(stack.size()==0) return false;
                else
                {
                
                    if(stack.peek()=='(' && c==')') stack.pop();
                     else if(stack.peek()=='[' && c==']') stack.pop();
                    else if(stack.peek()=='{' && c=='}') stack.pop();
                    else return false;
                }
                
            }
            else stack.push(c);
        }
        
        return stack.size()==0 ? true :false;