 // O(N) & SC O(1)
    public ListNode rotateRight(ListNode head, int k) {
     if(head == null || k == 0) return head;
    ListNode p = head;
    int len = 1;
    while(p.next != null) {
        p = p.next;
        len++;
    }
    p.next = head;
    k = k%len;
    for(int i = 0; i < len - k; i++)  // Yha is Loop me len-k jo kia h yhi main h ki hme kya set krna h loop me age while(k>0) se kroge to ans ni ayga usme address fas jyga but ase ans aa jyga
    {
        p = p.next;
    }
    head = p.next;
    p.next = null;
    return head;
    }