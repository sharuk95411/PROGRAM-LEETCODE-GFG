  // Logic Self 
 // both list ko revserse krke add kro then final add wli list ko again revserse kr do simple 
          ListNode current= l1;
         ListNode prev= null;
         ListNode next= null;
        while(current!=null) // Reverse the first List
        {
            next= current.next;
            current.next=prev;
            prev= current;
            current= next;
        }
        l1= prev;
          current= l2;
         prev= null;
         next= null;
        while(current!=null) // Reverse the second List
        {
            next= current.next;
            current.next=prev;
            prev= current;
            current= next;
        }
        l2= prev;
        int carry=0;
        ListNode dummy=new ListNode(-1), curr=dummy;
        while(l2!=null || l1!=null)  // Addition Perform
        {
        int a=l1!=null ?l1.val: 0;
         int b= l2!=null ? l2.val: 0;
            int sum= (a+b+carry);
            carry=sum/10;
            curr.next= new ListNode(sum%10);
            curr=curr.next;
           if(l1!=null) l1= l1.next;
            if(l2!=null) l2= l2.next;
            
                
        }
        if(carry>0)
        {
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
        
        
        current= dummy.next;
         prev= null;
         next= null;
        while(current!=null) // Again reverse the final list
        {
            next= current.next;
            current.next=prev;
            prev= current;
            current= next;
        }
        return prev;