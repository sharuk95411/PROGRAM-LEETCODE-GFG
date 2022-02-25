khd se kia h TC-O(n) and SC is O(n)
 public int maxDistToClosest(int[] arr) {
        
        int min_distance= Integer.MIN_VALUE;
        int count=1;
        int left_calculate[]= new int[arr.length];
        int right_calculate[]= new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count=1;
                left_calculate[i]=-1;
            }
            else 
            {
                left_calculate[i]=count;
                count++;
            }
            
        }
        count=1;
        
         for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==1)
            {
                count=1;
                right_calculate[i]=-1;
            }
            else 
            {
                right_calculate[i]=count;
                count++;
            }   
        }
        
        
        for(int i=0;i<arr.length;i++)
        {
             if(i==0)
             {
            min_distance= Math.max(min_distance,Math.max(left_calculate[i],right_calculate[i]));
             }
            else if(i==arr.length-1)
            {
                min_distance= Math.max(min_distance,Math.max(left_calculate[i],right_calculate[i]));
            }
            else
                min_distance= Math.max(min_distance,Math.min(left_calculate[i],right_calculate[i]));
        }
        return min_distance;
    }