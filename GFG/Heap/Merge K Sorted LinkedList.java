/* isme ek time pr priorityQueue me k elments rkhe hue h to usko add krne pr TC  klogk(where k is no of elements in PQ) hgi and n elements ko PQ me dl rhe h 
to klogk n times chlega to final TC (nklogk) hgi and n is total no of elements and SC is O(K) bcz PQ ka  max Size K tl hi jyga */
class Solution
{
   
 PriorityQueue<Node> pq = new PriorityQueue<>((p1, p2) -> p1.data - p2.data);
    Node mergeKList(Node[]arr,int k)
    {
        for(int i=0;i<k;i++)
        {
       
        
            pq.add(arr[i]);
        }
        Node head= new Node(-1);
        Node temp=head;
        while(pq.size()>0)
        {
            Node p= pq.poll();
            temp.next=p;
            temp=p;
            if(p.next!=null)
            {
                pq.add(p.next);
            
            }
            
        }
        return head.next;
    }
}
