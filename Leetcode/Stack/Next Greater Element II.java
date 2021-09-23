 // monotonic decreasing stack ka concept use hua h.
// yha array kha se strt hga ye identyfity krna tmhra km h 
    public int[] nextGreaterElements(int[] arr) {
        
        int n= arr.length;
        Stack<Integer>stack= new Stack<>();
        stack.push(arr[n-1]);
        
    int index,i,temp;
        for(index=n-1;index>=0;index--)
        {
            if(arr[index]>=stack.peek())
            {    
                temp= arr[index];
                while(stack.size()>0 && temp>=stack.peek())
           {
               stack.pop();
               if(stack.size()==0) // element  right side ni h an left me check krna h
               {
                   for(i=0;i<index;i++)
                   {
                       if(arr[i]>temp)
                       {
                           arr[index]=arr[i];
                           break;
                       }
                       
                   }
                   if(i==index) arr[index]=-1;
               } // closed the if bloack which traverse the left
               
           }  // closed while loop
            
          if(stack.size()>0) arr[index]=stack.peek(); // mtlb element right side me mil gya h
                stack.push(temp);
                
            } // closed if bloack
            
            else
            {
                temp=arr[index];
                arr[index]= stack.peek();
                stack.push(temp);
            }
            
        }
        return arr;