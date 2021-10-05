 // Pehli bat isme ans always 0 se bda ayga bcz only one element jo array me hga wo chahe jo h ho ans 1 dega .
/ *Logic-Isme hme asa subarray lena h jisme min max ka diff limit k andr ho bcz agr min and max limit k andr hoge to sare elements already ans me a jyge, 
 to min and max ko maintain krne k liye PQ ka use kr lege and sth me sliding window use krege jiski range me jitne elements hge whi ans hga hmara.*/
    // TC O(nlogn) SC O(n);
    public int longestSubarray(int[] nums, int limit) {
     
        PriorityQueue<Integer>min= new PriorityQueue<>();
        PriorityQueue<Integer>max= new PriorityQueue<>(Collections.reverseOrder());
        int i=0,j=0;
        int ans=0;
        
        for(j=0;j<nums.length;j++)
        {
            min.add(nums[j]);
            max.add(nums[j]);
            
            if(max.peek()-min.peek()<=limit) ans= Math.max(ans,j-i+1);
            else
                while(max.peek()-min.peek()>limit)
                {
                    min.remove(nums[i]);
                    max.remove(nums[i]);
                    i++;
                }
            
        }
        return ans;
    }