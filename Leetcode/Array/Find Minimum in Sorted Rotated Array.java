 public int findMin(int[] arr) {
        
        // Isko O(n) me krna bht easy h and yha jb sorted ki nat hui h to Binray search smjh jao and whi lga do then TC O(log(n)) ho jygi.
        int start=0;
        int end= arr.length-1;
       
        while(start<end)
        {
            int mid= start+(end-start)/2;
            
             if(arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return arr[start];
    }