public int largestRectangleArea(int[] arr) {
        // Logic- Pepcoding  and isse O(n2) ka intution aya h jiki help se niche O(n) code ka optization kia h
        // TC O(n) and SC O(2n) 
        int n= arr.length;
        
        int left[]= new int[n];
        left[0]=0;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            while(j>=0 && arr[j]>=arr[i])
            {//j--; and isse O(n2) me
                j= left[j]-1;  // is Logic se ye O(n) me chl rha h and yhi main logic h is program ko O(n) me krne ka ye j= left[j] 
krne k piche intution ye h ki uske left me last left[j] yha tk to jyga hi jyga ye sure h to hum left[j] k result ka advantage utha rhe h
suppose arr{2,2,5,6,4,1,7} yha jb hum 1 pr ayge to hme 4 ka result to pta hi h left me rkha h to 6,5 pr check q kre hum direct 5 k
left me jo value h wha check kre na yhi steps km ho ja rhe h jb hum j me left[j]-1 kr rhe h and yhi same chz right array k liye hgi
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