 /*   From elementary school math, we have a popular math trick which is the sum of 1+2+...+n = n*(n+1)/2, it can be used here. 
Since we are finding the missing number, just get the sum of all the n number first using the formula, 
and the minus it to the sum of all the numbers in the array, we get the missing number. */
    // TYN
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return total - sum;
    }