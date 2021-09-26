ye codeforces ka Question h https://codeforces.com/problemset/problem/1555/C 
// Question ka solution bht pyara h isko ase socha b ni ja skta h 
// Logic Animated Anand and logic smjh a gya h and code but code kse chlega ye ni
    // Yha only three possibility h ye yd rkhna bs jo ki vdio me btaya gya h 
    public long gridGame(int[][] grid) {
        
        int n = grid[0].length;
		long postfix_sum[] = new long[n+2];  // Postfix sum of first row
		long prefix_sum[] = new long[n+2];    // Prefix sum of second row
		for(int i=n;i>=1;i--){
			postfix_sum[i] = postfix_sum[i+1] + grid[0][i-1];
		}
		for(int i = 1 ;i<=n ; i++){
			prefix_sum[i] = prefix_sum[i-1] + grid[1][i-1];
		}
		long ans = (long)Math.pow(10,12);
		for(int i=1;i<=n;i++){
			ans = Math.min(Math.max(postfix_sum[i+1], prefix_sum[i-1]), ans);
		}
		return ans;