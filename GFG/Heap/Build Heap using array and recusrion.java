public class MyClass {
    
    
    static void buildHeap(int arr[],int n) 
    {
        int startIndex= (n/2)-1; // Index of the last non leaf element 
        for(int i=startIndex;i>=0;i--)
        {
            heapify(arr,n,i);  // ye fun n/2 times chlega and heapify log(n) times so total TC is O(n/2*log n)=O(n) hgi 
        }
    }
    static void heapify(int arr[],int n,int i)  // ye mthd hight k sth khel rha h so height k case me TC is O(log n) hgi 
    {
        int largest= i;
        int l=2*i+1;
        int r= 2*i+2;
        
    if(n>l && arr[l]>arr[largest])  largest= l; // yha minHeap k case me if ki condn me chnge ayga
     if(n>r && arr[r]>arr[largest])  largest=r; // yha minHeap k case me if ki condn me chng ayga
        
        if(largest!=i) // So swap it
        {
            int temp= arr[i];
            arr[i]= arr[largest];
            arr[largest]= temp;
            heapify(arr,n,largest);
        }
        return ;
    }
    static void printMaxHeap(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    
    public static void main(String args[]) {
      int arr[]= {1,3,5,4,6,11};
      int n= arr.length;
      buildHeap(arr,n);
      printMaxHeap(arr);
      
    }
}