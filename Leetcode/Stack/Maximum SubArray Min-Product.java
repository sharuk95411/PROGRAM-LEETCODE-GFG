// Brute Force -TC O(n2) SC O(1)
// Better TC O(n) SC O(n) and this is Better solution
// Optimal -Isme DP lgegi so use bd me krege.
// Logic -NTERVIEW AALA and TYNT after watching the logic bcz its not medium cateogry probelm 
class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) { // prefix Sum
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) { // find the next smallest element(index) from left
            while (!stk1.isEmpty() && nums[i] <= nums[stk1.peek()]) {
                stk1.pop();
            }
            if (stk1.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stk1.peek();
            }
            stk1.push(i);
        }
        for (int i = n - 1; i >= 0; i--) { //  find the next smallest element(index) from right
            while (!stk2.isEmpty() && nums[i] <= nums[stk2.peek()]) {
                stk2.pop();
            }
            if (stk2.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = stk2.peek();
            }
            stk2.push(i);
        }
        long max = 0;
        for (int i = 0; i < n; i++) { // make current element as Min value
            int l = left[i];
            int r = right[i];
            long sum = prefixSum[r] - prefixSum[l + 1];
            long prod = sum * nums[i];
            max = Math.max(prod, max);
        }
        return (int)(max % 1_000_000_007);
    }
}