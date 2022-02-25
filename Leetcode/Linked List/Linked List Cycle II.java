isko khd se mne O(N) TC me kia h jbki best way O(1) TC me h jo niche kia h 
https://leetcode.com/problems/linked-list-cycle-ii/discuss/44774/Java-O(1)-space-solution-with-detailed-explanation.
 yha pr code smjh aa gya h but intution ni smjh ai h kse explain kia gya h 

public ListNode detectCycle(ListNode head) {
                ListNode slow = head;
                ListNode fast = head;
        
                while (fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                    
                    if (fast == slow){
                        ListNode slow2 = head; 
                        while (slow2 != slow){
                            slow = slow.next;
                            slow2 = slow2.next;
                        }
                        return slow;
                    }
                }
                return null;
            }