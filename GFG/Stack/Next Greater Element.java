// Hint- Monotonic stack used  
Stack<Long>stack= new Stack<>();
        
        stack.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            long a= arr[i];
            while(stack.size()>0 && stack.peek()<a) 
            {
                stack.pop();
            }
            if(stack.size()>0)
            arr[i]= stack.peek();
            else arr[i]=-1;
            stack.push(a);
        }
        arr[n-1]=-1;
        return arr;