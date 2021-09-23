//== Tc O(n) & SC O(n) isko O(1) SC me krna h with O(N) TC ye iska optimal Solution hoga.
// logic pepcoding
 public int calculate(String s) {
        
        if(s.length()==0) return 0;
        Stack<Integer>stack= new Stack<>();
        int n= s.length();
        char sign='+';
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int value=0;
                while(i<n && Character.isDigit(s.charAt(i)))
                {
                    value= value*10 +(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign=='+') stack.push(value);
                else if(sign=='-') stack.push(-value);
                else if(sign=='/') 
                {
                    int a= stack.pop();
                    stack.push(a/value);
                }
                else if(sign=='*') 
                {
                    int a= stack.pop();
                    stack.push(a*value);
                }
            }
            else if(s.charAt(i)!=' ') sign= s.charAt(i);
                
        }
         int ans=0;
        while(stack.size()!=0)
        {
            ans= ans+stack.pop();
        }
        return ans;
    }