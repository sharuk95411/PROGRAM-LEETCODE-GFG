/* Brute Force Generate All possible set TC O(n2)
 public int maxProduct(int[] arr) {
        
        
    int ans=Integer.MIN_VALUE;
        int temp=1;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                temp= temp*arr[j];
                ans= Math.max(ans,temp);
            }
        
            temp=1;
        }
            return ans;
    }  
*/
 Optimal O(n) Logic- Code Library
public int maxProduct(int[] nums) {
     
        
        int max= nums[0];
        int min= nums[0];
        int ans= nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp= max;
                max= min;
                min= temp;
                max= Math.max(nums[i],nums[i]*max);
                min= Math.min(nums[i],nums[i]*min);
                ans= Math.max(max,ans);
            }
            else
            {
             
                 max= Math.max(nums[i],nums[i]*max);
                min= Math.min(nums[i],nums[i]*min);
                ans= Math.max(max,ans);
            }
        }
        return ans;
    } 
