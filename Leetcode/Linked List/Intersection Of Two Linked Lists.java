 // Awesome and easy Logic by Pepcoding
    // Hint-Length of two list is used 
    //TC O(n) SC O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int l1=0;
        ListNode temp= headA;
        while(temp!=null)
        {
            l1++;
            temp=temp.next;
        }
        temp= headB;
        int l2=0;
         while(temp!=null)
        {
            l2++;
            temp=temp.next;
        }
        int diff= Math.abs(l1-l2);
        ListNode first= headA,second=headB;
      for(int i=0;i<diff;i++)
      {
          if(l1>l2)
          {
              first=first.next;
          }
          else
          {
              second=second.next;
          }
      }
        while(first!=second)
        {
            first=first.next;
            second=second.next;
        }
        
        
        return first;