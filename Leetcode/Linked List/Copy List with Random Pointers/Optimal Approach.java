    
// Logic-TUF and logic is easy only 3 steps krne h jo ki logic dekhkr easily kr skte ho agr logic bhul jao tb 
// TC O(n) & SC O(1)
    public Node copyRandomList(Node head) {
        Node iter = head; 
          Node front = head;

 //in First loop: make copy of each node, and link them by next address of original list
          while (iter != null) {
            front = iter.next;

            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;

            iter = front;
          }

          // Second round: assign random pointers address for the copy nodes.
          iter = head;
          while (iter != null) {
            if (iter.random != null) {
              iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
          }

          // Third round: restore the original list, and extract the copy list.
          iter = head;
          Node pseudoHead = new Node(0);
          Node copy = pseudoHead;

          while (iter != null) {
            front = iter.next.next;

            // extract the copy
            copy.next = iter.next;
            copy = copy.next;

            // restore the original list
            iter.next = front;

            iter = front;
          }

          return pseudoHead.next;
        
    }