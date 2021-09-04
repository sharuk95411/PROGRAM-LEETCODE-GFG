//isko O(1) space me krne me mza a and h very simple isme non zero digit ko left shift krna h bs 
    public void moveZeroes(int[] nums) {
        
        
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[index]=nums[i];
                index++;
            }
            
        }
        while(index<nums.length)
        {
            nums[index]=0;
            index++;
        }
    }