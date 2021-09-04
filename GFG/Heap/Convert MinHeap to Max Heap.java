public class Solution {
    public static void minHeapToMaxHeap(long[] arr) {
        
        int startIndex= (arr.length/2)-1;
        for(int i= startIndex;i>=0;i--)
        {
            heapify(arr,i,arr.length);
        }
        
        
    }
    static void heapify(long arr[],int i,int n)
    {
        int largest=i;
        int l= 2*i+1;
        int r= 2*i+2;
        if(n>l && arr[l]>arr[largest])largest= l;
        if(n>r && arr[r]>arr[largest]) largest=r;
        if(largest!=i)
        {
            long temp= arr[i];
            arr[i]= arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,n);
        }
    }
}