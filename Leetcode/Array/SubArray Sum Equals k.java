 // Logic- Pepcoding 
    // hint- PrefixSum And HashMap use hga with No recursion 
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>h= new HashMap<>();
  h.put(0,1); // {3,2,6} and k=5 so in cases k liye hmne ye add kia h and ye vdio me btaya gya h
        int count=-0;
        int prefix_sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            prefix_sum=prefix_sum+nums[i];
            
            if(h.containsKey(prefix_sum-k))
            {
                count=count+h.get(prefix_sum-k);
                h.put(prefix_sum,h.getOrDefault(prefix_sum,0)+1 );
            }
            else
            h.put(prefix_sum,h.getOrDefault(prefix_sum,0)+1);
        }
        return count;
        
    }