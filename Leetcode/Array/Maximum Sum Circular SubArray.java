class Solution {
    // Logic-codebix and very Easy 
    // Hint- Isme jugad lgaya gya h Kadan's algo ka use krke 
    public int maxSubarraySumCircular(int[] nums) {
     
       int x= A(nums);
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum= sum+nums[i];
            nums[i]= nums[i]*(-1);
        }
        
        int y= A(nums);
        if(y+sum==0) return x;
        else  return Math.max(x,y+sum);
    } 
    private int A(int nums[])
    {
        int ans= nums[0];
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            temp=temp+nums[i];
            if(temp < nums[i]) temp=nums[i];
            
                ans= Math.max(ans,temp);        
        }
        return ans;
    }
}