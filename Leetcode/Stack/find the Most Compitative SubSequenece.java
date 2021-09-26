// Question smjhna h to led coding se smjh lena.
// logic -https://leetcode.com/problems/find-the-most-competitive-subsequence/discuss/952786/JavaC%2B%2BPython-One-Pass-Stack-Solution
// isme monotonic incresing stack ka concet use hua h .
// pop krte time ye condion stack.size() - 1 + A.size() - i >= k main h bus aur sb simple h ye smjhna h to {4,3,2,1} and k=2 lo tb monotonic stack bnane pr end me only 1 bchga jo ki ans ni h to is condition se and 2,1 ayga so this condition is very important but i don't know how to write this self
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
            Stack<Integer> stack = new Stack<>();
    int[] result = new int[k];
    for (int i = 0; i < nums.length; i++) {
        while (!stack.empty() && stack.peek()>nums[i] && nums.length - i + stack.size() > k) {
            stack.pop();
        }
        if (stack.size() < k) {
            stack.push(nums[i]);
        }
    }
    for (int i = k - 1; i >= 0; i--) {
        result[i] = stack.pop();
    }
    return result;
        
    }
}