  // easy only ek case add hoga new jb mid last equals ho yha start,mid equals ho
    // Logic -Codebix dno question ka bht easy way me smjaya gya h
    //TC-O(log(n))
    public int findMin(int[] arr) {
        
        int start=0;
        int end= arr.length-1;
       
        while(start<end)
        {
            int mid= start+(end-start)/2;
            
             if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else if(arr[start]>arr[mid]) end=mid;
            else
            {
                end--;
            }
        }
        return arr[start];

    }