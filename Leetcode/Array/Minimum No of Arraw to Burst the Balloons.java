public int findMinArrowShots(int[][] arr) {
      //easy and acha question h logic Pepcoding  
       if(arr.length==0) return 0;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
     /*   Arrays.sort(arr, (a,b)->(a[1]-b[1])); ye use ni kia h bcz iska reasn
    https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/discuss/887875/If-you-cannot-pass-2147483646-214748364521474836462147483647  
pr h jo smjh ni aya h */
        
        int arrow= 1;
        int end= arr[0][1];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>end)
            {
                end= arr[i][1];
                arrow++;
            }
        }
        return arrow;
    }