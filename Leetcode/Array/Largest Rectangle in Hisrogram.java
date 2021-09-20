public int largestRectangleArea(int[] arr) {
        // Logic- Pepcoding 
        // TC O(n) and SC O(2n) 
        int n= arr.length;
        
        int left[]= new int[n];
        left[0]=0;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j>=0 && arr[j]>=arr[i])
            {//j--; and isse O(n2) me
                j= left[j]-1;  // is Logic se ye O(n) me chl rha h and yhi main logic h is program ko O(n) me krne ka
            }
            left[i]= j+1;
        }
         System.out.println(Arrays.toString(left));
         int right[]= new int[n];
        right[n-1]=n-1;
        for(int i= n-2;i>=0;i--)
        {
            int j=i+1;
            while(j<n && arr[j]>=arr[i])
            {
                //j++;  and isse O(n2) mw
                j=right[j]+1; // is Logic se ye O(n) me chl rha h and yhi main logic h is program ko O(n) me krne ka
            }
            right[i]= j-1;
        }
          System.out.println(Arrays.toString(right));
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            area= Math.max(area,(right[i]-left[i]+1)*arr[i]);
        }
        return area;
        
    }