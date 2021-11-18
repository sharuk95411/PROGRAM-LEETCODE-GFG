// logic pepcoding Kernighan's Algorithm 
    public int[] countBits(int n) {
        int arr[]= new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int temp=i;
              int count=0;
            while(temp>0)
            {
                int rsbm= temp & -temp;
                temp=temp-rsbm;
                count++;
            }
            arr[i]= count;
            
        }
           return arr;
}