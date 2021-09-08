  //  isko 2 types se kia gya h and dno hi achi approach h 
   //first one- TC is O(nlogn) and SC is O(n)
// Second one is - TC is O(n) and SC is O(1). ye dno types se khd se krne ko try krna 
     /*   Brute Force
int  arr[] = nums.clone();
        Arrays.sort(arr);
        int start_index=nums.length,end_index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=arr[i]) 
            {
                 start_index=Math.min(start_index,i);
                end_index= Math.max(end_index,i);
            }
        }
        
            if(end_index==0) return 0;
        else return end_index-start_index+1;
*/
        
// Optimal Approach
       int low=-1,high=nums.length-1;
        int a= Integer.MAX_VALUE;
        for(int i= nums.length-1;i>=0;i--)
        {
            a= Math.min(a,nums[i]);
            if(nums[i]>a) low=i;
        }
        a= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            a= Math.max(a,nums[i]);
            if(a>nums[i]) high=i;
        }
        return low==-1 ? 0: high-low+1;
    }