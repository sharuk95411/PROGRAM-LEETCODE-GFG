Brute- O(n3) and isko mne O(n2) me kia h 
isme Set ka use seekha h and kse ek sath kai element set me add kr skte h and kse set ko list me convert krna h wo seekha h 
 logic codeBix
public List<List<Integer>> threeSum(int[] nums) {
         Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {     res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
                }
                else if ( sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(res);
        
