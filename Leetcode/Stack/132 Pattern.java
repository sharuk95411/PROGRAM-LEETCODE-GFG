 Brute force- TC O(n2) and SC O(1) gives TLE
/*
 int left_min= nums[0];
        for(int j=1;j<n-1;j++)
        {
            
            for(int k=j+1;k<n;k++)
            {
                if(nums[k]>left_min && nums[j]>nums[k]) return true;
                
            }
            left_min=Math.min(nums[j],left_min);
        }    
        return false;
*/
Better - TC O(n) and SC O(n) ye khd se try krna bcz iski approach achi h isko self se krne k bad optimal pr jna abhi use only likha h 
// Isme Stack ka element j ka kam kr rha h hota h and second variale k ka km krta h and i se comapre to hum kr hi rhe h
// Detailed Explain- https://leetcode.com/problems/132-pattern/discuss/906789/Short-Java-O(N)-Solution-with-Detailed-Explanation-and-Sample-Test-Case-or-Stack-or-100
Stack <Integer> stack = new Stack ();
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums [i] < second)
                return true;
            while (!stack.isEmpty() && nums [i] > stack.peek ())
                second = stack.pop ();
            stack.push (nums [i]);
        }
        return false;

// Optimal-TC O(n) and SC O(1)
Detailed Explain-https://leetcode.com/problems/132-pattern/discuss/94089/Java-solutions-from-O(n3)-to-O(n)-for-%22132%22-pattern-(updated-with-one-pass-slution)
int n = nums.length, top = n, third = Integer.MIN_VALUE;

    for (int i = n - 1; i >= 0; i--) {
        if (nums[i] < third) return true;
        while (top < n && nums[i] > nums[top]) third = nums[top++];
        nums[--top] = nums[i];
    }
    
    return false;

