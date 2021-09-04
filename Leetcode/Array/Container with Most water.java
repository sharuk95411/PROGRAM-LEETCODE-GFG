/*===Isme sbse phle dekho ans k liye tmhe kya kya chahiye (two numbrs and index value of two numbers) and in two numbers me se jo min no ho and dno index ka diff
ko multiply kr do yhi ans hga so yhi approach lgegi while loop me TC is O(n) and SC is (1) me ans aa jyga.and ye approach strt se last me lgni suru hgi bcz hm asa mnege
ki strt and last ki value le lo ans max ho jyga so yhi approach loop me use hgi .===*/
 public int maxArea(int[] arr) {
             int result=0;
        int low= 0;
        int high= arr.length-1;
        while(low<high)
        {
            int min= Math.min(arr[low],arr[high]);
            int diff= high-low;
            result= Math.max(result,diff*min);
           
            if(arr[low]<arr[high] )
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return(result);
        
    }