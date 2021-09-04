class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length && k>0 && nums[i]<0;i++)
        {
            nums[i]= -nums[i];
            k--;
        }
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(k>0 && k%2!=0) sum= sum-2*nums[0];
        return sum;
    }
}