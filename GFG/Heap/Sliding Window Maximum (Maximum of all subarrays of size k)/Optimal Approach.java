
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
       int arr[]= new int[nums.length-k+1];
        int index=0;
        Deque<Integer> queue = new LinkedList<>();
    int i;
    for(i = 0; i < k; i++) {
      while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
        queue.removeLast();
      }
      
      queue.addLast(i);
    }
    
    for(; i < nums.length; i++)// ye nai chz sikhne ko mili h isme 
 {
      arr[index]= nums[queue.peek()];
        index++;
      
      while(!queue.isEmpty() && i - k >= queue.peek()) {
        queue.removeFirst();
      }
      
      while(!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
        queue.removeLast();
      }
      
      queue.addLast(i);
    }
     arr[index]= nums[queue.peek()];
    return arr;
    
}
}