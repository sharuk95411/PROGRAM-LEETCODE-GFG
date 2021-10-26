// Acha Qustion h & logic self
int countRev (String s)
    {
        // your code here   
        if(s.length()%2!=0 ) return -1;
        Stack<Character>stack= new Stack<>();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(stack.size()==0 && c=='}') // yha jb stack empty ho aur hme closing mile to hme use opening me convert krke push krana h 
            {
                count++;
                stack.push('{');
            }
            else if(c=='}')
            {
                if(stack.peek()=='{')
                {
                    stack.pop();
                }
            }
            else stack.push(c);
        }
        
        return (stack.size()/2+count);
        
    }