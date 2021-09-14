 // Logic Algorithm Made easy 
// easy logic hint-use dummy Node and Two Pointer Technique used
    // TC is O(n) bcz we visit each node only one time so two while loop se fark ni pdhta h 
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode dummy= new ListNode(0), prev=dummy,curr=head;
        
        while(curr!=null)
        {
            if(curr.next!=null && curr.val==curr.next.val)
            {
                while(curr.next!=null && curr.val==curr.next.val)
                {
                    curr= curr.next;
                }
                curr=curr.next;
                prev.next=curr;
            }
            else
            {
                prev.next= curr;
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }