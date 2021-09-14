// logic self
 public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Boolean>h= new HashMap<>();
        if(head==null) return null;
        
        ListNode temp=head;
        
        while(temp!=null)
        {
            if(h.get(temp)==null)
            {
                h.put(temp,true);
                temp= temp.next;
            }
            else
            {
                return temp;
            }
        }
        return null;
    }