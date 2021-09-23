public int evalRPN(String[] arr) {
        int ans=0;
        if(arr.length==0) return ans;
        Stack<Integer>s= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("+")==true) 
            {
                int a =s.pop();
                int b= s.pop();
                s.push(a+b);
            }
           else if(arr[i].equals("-")==true) 
            {
                                int a =s.pop();
                int b= s.pop();
                s.push(b-a);
            }
            else if(arr[i].equals("/")==true) 
            {
                                int a =s.pop();
                int b= s.pop();
                s.push(b/a);
            }
           else if(arr[i].equals("*")==true) 
            {
                                int a =s.pop();
                int b= s.pop();
                s.push(a*b);
            }
            else
            {
                s.push(Integer.parseInt(arr[i]));
            }
        }
            return s.peek();
    }