class Solution {
    int[] kLargest(int[] arr, int n, int k) {
         int a[]=new int[k];
        for(int i=n/2-1;i>=0;i--)
        heapify(arr,i,n);
        
        for(int i=0;i<k;i++) // yha agr k ki value n b ho jye to i increase ho rha h 
        and sth sth n decrease to final ye loop n/2 times hi chlega so TC is O(n/2*logn)=O(n) hgi 
        {
        a[i]=arr[0];
        arr[0]=arr[n-1];
        n--;
        heapify(arr,0,n);
        }
        return a;
        
    }
    public void heapify(int a[],int i,int n)
    {
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && a[l]>a[max])
        max=l;
        if(r<n && a[r]>a[max])
        max=r;
        if(i!=max)
        {
            int swap=a[i];
            a[i]=a[max];
            a[max]=swap;
            heapify(a,max,n);
        }
    }
}