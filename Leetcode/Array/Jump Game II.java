// logic Anurag Codes and Greedy approach use hgi isme 
class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentJumpEnd) /*if we have reach the current point jha se jump start ki thi ya krni h so jump++ kr dege and
 currentJump ko update kr dge ki ab wha se max kha tk ja sjte h.  */
            {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
        
    }
}