// Isme Sare sub Array generate krlo and un sbme ones and zeros count kr lo 
// TC- O(n2) 

 int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int ones=0;
            int zeros=0;
            for(int j=i;j<nums.length;j++)
            {
                
                if(nums[j]==0) zeros++;
                else ones++;
                if(ones==zeros)
                {
                    count= Math.max(count,j-i+1);
                }
            }
        }
        return count;