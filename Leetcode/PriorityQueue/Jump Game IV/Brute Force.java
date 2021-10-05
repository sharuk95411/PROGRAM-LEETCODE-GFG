// Brute force Approach  TC - O(kn)
// Logic -- Ayushi Sharma
// Iska Optimized krna bcha h bcz wo abhi smjh ni a rha h 
class Solution {
    public int maxResult(int[] nums, int k) {
        
        
        int ans= A(nums,0,k);
        return ans;
    }
    
    private int A(int nums[],int i,int k)
    {
        if (i>=nums.length-1) return nums[nums.length-1];
        
        int max= Integer.MIN_VALUE;
        
        for(int j=i+1;j<=k+i;j++)
        {
            max= Math.max(max, nums[i]+A(nums,j,k));
        }
        return max;
    }
}