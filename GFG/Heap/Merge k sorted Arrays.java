its vey simple first 2d array ka sara data 1d array me dl lo then uspr heap sort lga do and element print kra do

class Solution
{
    
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        
          int a[]= new int[k*k];
       int index=0;
        for(int i=0;i<k;i++)
        {
            
            for(int j=0;j<k;j++)
            {
                a[index]= arr[i][j];
                index++;
            }
            
        }
      minHeap(a,a.length);
      for(int i= a.length-1;i>=0;i--)
      {
          heapSort(a,0,i);
      }
     
     ArrayList<Integer>l= new ArrayList<>();
     for(int i=0;i<a.length;i++)
     {
         l.add(a[i]);
     }
     return l;
        
    }
    static void heapSort(int a[],int start,int end)
{
       int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        heapify(a,0,end);
}    
    static void minHeap(int a[],int n)
    {
        int start=(n/2)-1;
        for(int i=start;i>=0;i--)
        {
            heapify(a,i,n);
        }
        
    }
    static void heapify(int arr[],int i,int n)
    {
        int largest=i;
        int l= 2*i+1;
        int r= 2*i+2;
        
        if(n>l && arr[largest]<arr[l]) largest= l;
        if(n>r && arr[largest]<arr[r]) largest=r;
        if(largest!=i)
        {
            int temp =arr[i];
            arr[i]= arr[largest];
            arr[largest]= temp;
            heapify(arr,largest,n);
        }
        
    }
}