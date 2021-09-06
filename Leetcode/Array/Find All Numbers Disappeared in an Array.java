  // logic from Ashish Kumar
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>l= new ArrayList<>();
        if(nums.length==0) return l;
        
        for(int i=0;i<nums.length;i++)
        {
            int index= Math.abs(nums[i])-1;
        
            if(nums[index]>0) nums[index]=-nums[index];
            
       }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) l.add(i+1);
        }
        return l;
    }