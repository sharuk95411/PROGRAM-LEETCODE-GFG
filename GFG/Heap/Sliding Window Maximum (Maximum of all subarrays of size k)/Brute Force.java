
Max-heap(PriorityQueue) is a suitable data structure as it provides constant-time retrieval and logarithmic time removal of both the minimum and maximum elements in it, 
it takes constant time to find the maximum element and insertion and deletion takes log n time. 
so is program ki TC nlogn aygi but ye b achi approach h and GFG +leetcode pr ye TLE de rha h 


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[] {};
          int len = nums.length;
        int[] result = new int[len - k + 1];
         Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder() );
        for(int i = 0; i < k; i ++){
        queue.add(nums[i]);
    }
    result[0] = queue.peek();
    for(int i = k; i < len; i ++){
        queue.remove(nums[i - k]);
        queue.add(nums[i]);
        result[i - k + 1] = queue.peek();
    }
   
    return result;
        
    }
    
}