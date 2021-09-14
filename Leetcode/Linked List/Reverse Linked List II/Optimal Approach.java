 // logic Naresh Gupta and its easy logic
    // hint slow and fast start with head . slow,fast= head;
    // TC is O(2n)==O(n) and SC is O(1)
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow= head,fast=head;
        while(fast!=null && fast.next!=null )
        {
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast)
            {
                slow= head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast= fast.next;
                }
                return slow;
            }
        }
        return null;
    }