 // logic Hello World and its very easy so ise khd hi try krna
    //hint- isi list me jugd lgaya jyga koi new list ni bnegi and carry ka dhyn rkhna uske liye may be bn skti h according to situation.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy= new ListNode(0);
        ListNode temp1=l1,temp2=l2,curr=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
            int a= temp1!=null ? temp1.val: 0;
            int b= temp2!=null ? temp2.val: 0;
            int sum= carry+a+b;
            carry= sum/10;
            curr.next= new ListNode(sum%10);
            curr= curr.next;
            if(temp1!=null) temp1= temp1.next;
            if(temp2!=null) temp2= temp2.next;
        }
        if(carry>0)
        {
            curr.next= new ListNode(carry);
        }
        return dummy.next;
    }