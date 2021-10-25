 // Isme sara data sorted form me h [0][0] se  end tak 
    // logic self
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++)
        {
            int arr[]= matrix[i];
             if(target>=arr[0] && target<=arr[arr.length-1])
             {
                 int start= 0;
                 int end= arr.length-1;
                     while(start<end)
                     {
                         int mid= start+(end-start)/2;
                         
                         if(target==arr[mid]) return  true;
                         else if( target>arr[mid]) start= mid+1;
                         else end=mid;
                     }
                 if(arr[start]==target) return true;// [[1]] ,target 1 ye is case k liye h
                 return false;
             }
        }
     
        return false;
    }