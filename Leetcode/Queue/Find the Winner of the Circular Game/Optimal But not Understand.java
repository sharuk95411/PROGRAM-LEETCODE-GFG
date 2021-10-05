 // logic by- https://leetcode.com/problems/find-the-winner-of-the-circular-game/discuss/1152705/JavaC%2B%2BPython-4-lines-O(n)-time-O(1)-space
// iska logic smjh ni aya h kse work kr rha h
public int findTheWinner(int n, int k) {
        
        int res = 0;
        for (int i = 1; i <= n; ++i)
            res = (res + k) % i;
        
        return res + 1;
    }