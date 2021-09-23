// Hint-Monotonic Stack used
     class Pair
    {
        int value,index;
        Pair(int value,int index)
        {
            this.value=value;
            this.index=index;
        }
    }
    public int[] dailyTemperatures(int[] arr) {
        int n= arr.length;
         Stack<Pair>stack= new Stack<>();
        stack.push(new Pair(arr[n-1],n-1));
        arr[n-1]=0;
        
        for(int i=n-2;i>=0;i--)
        {
            
            Pair p= stack.peek();
            if(arr[i]>=p.value)
            {
                while(stack.size()>0 && arr[i]>=p.value)
                {
                    stack.pop();
                    if(stack.size()>0)   p=stack.peek();
                }
                if(stack.size()==0) 
                {
                    stack.push(new Pair(arr[i],i));
                    arr[i]=0;
                }
                else
                {
                    stack.push(new Pair(arr[i],i));
                    arr[i]=p.index-i;
                }
                
            } // if closes
            else
            {
                p =stack.peek();
                stack.push(new Pair(arr[i],i));
                arr[i]= p.index-i;
            }
        }
        
                           return arr;
        