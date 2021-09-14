  // Logic -Self
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null) return head;
         
        ListNode dummy= new ListNode(-1),prev=dummy,curr=head;
        
        while(curr!=null)
        {
            if(curr.val==val)
            {
                curr=curr.next;
                
            }
            else
            {
             prev.next=curr;
                prev=curr;
                curr=curr.next;
            }
        }
        
        prev.next=null;
        return dummy.next;
        
    }