logic- TUF(Kadane Algo and isme sum ko tb tk carry kia jata h jb tk wo negative ni ho jta h yhi logic h is algo ka 
 public int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int max_sum= nums[0];
        int sum= 0;
        
        for(int i=0;i<nums.length;i++)
        {
            
            sum= sum+nums[i];
            if(sum>max_sum) max_sum= sum;
             if(sum<0) sum=0;
        }
         return max_sum;
    }