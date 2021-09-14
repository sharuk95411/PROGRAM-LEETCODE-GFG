TC is O(n) and SC is O(1) 
Approach- left point ko find krna then wha se right tk ki list ko reverse kr dena simple Dummy+2 Pointer Approach use hgi simple h Ques
 public ListNode reverseBetween(ListNode head, int left, int right) {
        int pos=1;
        ListNode dummy= new ListNode(0),prev=dummy,curr= head;
        while(pos!=left)
        {
            prev.next=curr;
            prev=curr;
            curr=curr.next;
            pos++;
        }
    
    ListNode a= curr;
        ListNode b=curr.next;
        while(pos<right)
        {
            ListNode c= b.next;
            b.next=a;
            a=b;
            b=c;
            pos++;
            
            
        }
        prev.next=a;
        curr.next=b;
         return dummy.next;
    }
   