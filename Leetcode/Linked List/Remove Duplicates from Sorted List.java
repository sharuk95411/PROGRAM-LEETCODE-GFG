 // TC is O(n)hgi bhle hi two while loops lge h but unki working O(n) times hi hgi you can check by dry run the program
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        if(head.next==null) return head;
        ListNode p1= head;
        ListNode p2= head.next;
        while(p2!=null)
        {
            while(p2!=null && p1.val==p2.val )
            {
                p2=p2.next;
            }
              p1.next= p2;
            p1=p2;
            if(p2==null) break;
            
            p2=p2.next;
        }
        return head;
    }