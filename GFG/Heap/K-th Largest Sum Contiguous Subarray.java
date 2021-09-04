import java.util.*;
public class MyClass {
    
    
    static void A(int arr[],int n,int k)
    {
        int sum=0;
        List<Integer>l= new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            l.add(arr[i]);
            sum= arr[i];
            for(int j=i+1;j<n;j++)
            {
                sum= sum+arr[j];
                l.add(sum);            
                
            }
        }
        l.add(arr[n-1]);
       // System.out.println(l);
        int startIndex= (l.size()/2)-1;
        
        for(int i=startIndex;i>=0;i--)
        {
             minHeap(l,i,l.size());
        }
         //  System.out.println(l);
        for(int i=l.size()-1;i>=0;i--)
        {
            heapSort(l,0,i);
        }
            // System.out.println(l);
        System.out.println(l.get(k-1));
        
    }
     
    
  static void heapSort(List<Integer>l,int start,int end)
{
       int temp=l.get(start);
        l.set(start,l.get(end));
        l.set(end,temp);
        minHeap(l,0,end);
}    
    
    static void minHeap(List<Integer>list,int i,int n)
    {
        int largest=i;
        int l= 2*i+1;
        int r= 2*i+2;
        
        if(n>l && list.get(largest)>list.get(l) ) largest= l;
        if(n>r && list.get(largest)>list.get(r)) largest=r;
        if(largest!=i)
        {
            int temp =list.get(i);
            list.set(i,list.get(largest));
             list.set( largest, temp);
            minHeap(list,largest,n);
        }
        
    }
    public static void main(String args[]) {
        int arr[] = {20,-5,-1} ;
        int n = arr.length;
        int k = 3;

      A(arr,n,k);
}
}