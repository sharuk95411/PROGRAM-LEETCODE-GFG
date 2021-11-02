class Solution {
    // Logic-CodeBix
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        
        HashMap<Integer,Boolean>h= new HashMap<>();
        
        for(int a: arr) h.put(a,true);
        
        for(int a: arr)
        {
            if(h.containsKey(a-1)) h.put(a-1,false);
        }
        
        int ans=1;
        for(Integer k : h.keySet())
        {
            if(h.get(k))
            {
                ans= Math.max(ans,findLength(h,k-1));
            }
            
        }
        return ans;
        
    }
    private int findLength(HashMap<Integer,Boolean>h,Integer k)
    {
        int ans=1;
        while(h.containsKey(k)==true && h.get(k)==false)
        {
            k--;
            ans++;
        }
        return ans;
    }
}