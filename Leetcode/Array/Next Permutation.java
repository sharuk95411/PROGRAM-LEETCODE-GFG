// logic- Striver but iske piche ka intution abhi clear ni hua h bs step smjh aa gye h4
    // Step 1- find first smaller element index from the last and let this number is a
    // step 2- find first larger element index which is greater than a from the last and this elemnt is b
    // Step 3- Now Swap a and b 
    // Step 4- now arrange the descending order and is line ki intution smjh ai h bs ki q kr rhe h 
    public void nextPermutation(int[] nums) {
        
        int i= nums.length-2;
        
        while(i>=0 && nums[i]>=nums[i+1])i--; // step 1
        if(i>=0)
        {
            int j= nums.length-1;
            while(nums[i]>=nums[j]) j--;    // step 2
            swap(nums,i,j);  // step 3;
        }
        reverse(nums,i+1,nums.length-1); //step 4
    }
    
    private void swap(int nums[],int i,int j)
    {
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    private void reverse(int nums[],int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }