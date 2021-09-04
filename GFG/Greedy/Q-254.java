int Maximize(int arr[], int n)
    {
        
        long  sum=0;
    Arrays.sort(arr);
    for(int i=1;i<n;i++)
    {
        sum=(sum+(long)arr[i]*i)% 1000000007;
    }
    return (int)sum;
        
    }   