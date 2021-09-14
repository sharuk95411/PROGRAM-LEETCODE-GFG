 // logic Naresh Gupta and isme rec lg rha h so SC is not O(1) but ye solution b bht acha h and yhi krna bcz O(1) wla bht complicated h 
    // Hint- Merge Sort and isme merge wla function main h so use khd se try krna 
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode mid= getmid(head);
      ListNode left= sortList(head);
        ListNode right= sortList(mid);
        return merge(left,right);
        
    }
    private ListNode getmid(ListNode head)
    {
        ListNode slow= head,fast= slow.next,prev=slow;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow= slow.next;
            fast= fast.next.next;
        }
        if(fast==null)
        {
            prev.next=null;
            return slow;
        }
        else
        {
            prev=slow.next;
            slow.next=null;
            return prev;
        }
    }
    private ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummy= new ListNode(0),curr= dummy;
        while(l1 !=null && l2!=null)
        {
        if(l1.val<=l2.val)
        {
        curr.next= l1;
            l1=l1.next;
            
        }
        else
        {
            curr.next=l2;
            l2=l2.next;
        }
        curr=curr.next;
        }
        curr.next= l1!=null ? l1:l2;
        return dummy.next;
    }