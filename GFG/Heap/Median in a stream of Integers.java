
  //isme TC O(nlogn) hgi bcz half element ek heap me and half ek heap me add ho rhe h and SC is O(n) bcz total bcz size of both heap =No of Elements 
class Solution
{
   static PriorityQueue<Integer>maxHeap= new PriorityQueue<>(Collections.reverseOrder());
   static  PriorityQueue<Integer>minHeap= new PriorityQueue<>();
    public static void insertHeap(int x)
    {
    
    if(maxHeap.size()==0|| maxHeap.peek()>=x)
    {
    maxHeap.add(x);
    }
    else
    {
        minHeap.add(x);
    }
    if(maxHeap.size()>minHeap.size()+1 )
    {
        minHeap.add(maxHeap.poll());
    }
    else if(maxHeap.size()<minHeap.size())
    {
        maxHeap.add(minHeap.poll());
    }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        if(maxHeap.size()==minHeap.size() )
        {
        double val=(maxHeap.peek()+minHeap.peek())/2;
        return val;
        }
        else
        {
            return Double.valueOf(maxHeap.peek());
        }
    }
    
}