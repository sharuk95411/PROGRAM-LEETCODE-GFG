 // Logic CodeBix And its Awesome llogic and code b mstt likha h 
   // isme mid 3 pointers ki help se nikala gya h jo ki mstt way h jse cycle detect me krte h
    // LinkedList revserse krne k liye 3 pointers use hte h and isme reverse hgi list.
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = head;
        ListNode l2 = reverse(slow);
        merge(l1, l2);    
    }
    
    private static ListNode reverse(ListNode l2){
        if(l2 == null) return null;
        ListNode prev = null;
        ListNode curr = l2;
        ListNode next = l2.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    private static void merge(ListNode l1, ListNode l2) {
        while (l2 != null) {
            ListNode next = l1.next;
            l1.next = l2;
            l1 = l2;
            l2 = next;
        }
        
    }