// Ques Easy h so TYN
// Logic -codeBix
 public int lengthOfLIS(int[] nums) {
        
        return A(nums,-1,0);
    }
    
    private int A(int nums[],int prev,int curr)
    {
        if(curr==nums.length) return 0;
        
        int a1=0;
        
        if(prev==-1 || nums[curr]>nums[prev])
        {
            a1= 1+A(nums,curr,curr+1);
        }
        int a2= A(nums,prev,curr+1);
    
        
        return Math.max(a1,a2);
    }