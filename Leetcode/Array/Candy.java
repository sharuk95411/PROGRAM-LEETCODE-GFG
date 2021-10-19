// Better-TC O(n) SC O(n) logic from TECHDOSE TYN  and isse 95%  aya
// Optimal- TC O(n) and SC O(1) ye bd me krna h 
    public int candy(int[] arr) {
        
        int n = arr.length;
        int left[]= new int[n];
        Arrays.fill(left,1);
        int right[]= new int[n];
        Arrays.fill(right,1);
        
        for(int i=1;i<n;i++)
        {
            if( arr[i]>arr[i-1])
            {
                left[i]= left[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1])
            {
                right[i]= right[i+1]+1;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=count+Math.max(left[i],right[i]);
        }
        return count;
    }