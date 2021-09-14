// TC O(l1+l2) and SC is O(1)
    // logic- Pepcoding and its very easy logic 
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        else if(l2==null) return l1;
        ListNode dummy= new ListNode(0), t1= l1,t2=l2,temp= dummy;
        
        dummy.next= t1.val>=t2.val? t2: t1;
        
        while(t1!=null && t2!=null)
        {
            if(t1.val>=t2.val)
            {
                temp.next= t2;
                temp= temp.next;
            t2= t2.next;
            }
            else
            {
                temp.next= t1;
                temp= temp.next;
                t1=t1.next;
            }
        }
        if(t1==null) temp.next= t2;
        else temp.next= t1;
        return dummy.next;
        
        
    }