//== Tc is O(l1+l2) and SC is O(11+l2)
// Logic TUF
 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummy= new ListNode(0), temp= dummy;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val>=l2.val)
            {
                temp.next= new ListNode(l2.val);
                temp= temp.next;
                l2= l2.next;
                
            }
            else
            {
                temp.next= new ListNode(l1.val);
                    temp= temp.next;
                l1= l1.next;
            }
        }
        while(l1!=null)
        {
            temp.next= new ListNode(l1.val);
            temp= temp.next;
            l1=l1.next;
            
        }
        while(l2!=null)
        {
            temp.next= new ListNode(l2.val);
            temp= temp.next;
            l2=l2.next;
            
        }
        return dummy.next;
    }