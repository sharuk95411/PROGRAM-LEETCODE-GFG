/* isme ek time pr priorityQueue me k elments rkhe hue h to usko add krne pr TC  klogk(where k is no of elements in PQ) hgi and n elements ko PQ me dl rhe h 
to klogk n times chlega to final TC (nklogk) hgi and n is total no of elements and SC is O(K) bcz PQ ka  max Size K tl hi jyga */


class Solution
{
     static  class Pair
    {
        int rowNo,index,value;
        Pair(int rowNo,int index,int value)
        {
            this.rowNo= rowNo;
            this.index=index;
            this.value=value;
        }
    }
	static int[] findSmallestRange(int[][] arr,int n,int k)
	{
	   PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.value - p2.value);
       int max= Integer.MIN_VALUE;
       int range= Integer.MAX_VALUE;
       int min= Integer.MAX_VALUE;
       int index=0;
        for(int i=0;i<k;i++)
        {
            Pair obj= new Pair(i,0,arr[i][index]);
            if(arr[i][0]>max) max=arr[i][index];
            
            
        pq.add(obj);
        }
        int high=0,low=0;
       // System.out.println(max);
       //System.out.println(pq.poll().value);
       
         while(pq.size()>0)
         {
             Pair p= pq.poll();
             min= p.value;
             if(range>max-min) 
             {
                 range= max-min;
                 low=min;
                 high=max;
                 
             }
             index=p.index +1;
             
             if(index>=n) break;
             int r=p.rowNo;
            // System.out.println(r);
             if(arr[r][index]>max) max= arr[r][index];
              Pair obj= new Pair(r,index,arr[r][index]);
              pq.add(obj);
             
             
         }
         int ans[]= {low,high};
         return ans;
	}
}

