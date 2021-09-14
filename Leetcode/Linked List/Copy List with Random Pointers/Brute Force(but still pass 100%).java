// Logic from Pepcoding wha se Deep copy k bare me smjh lena and ye code self kia h with the help of logic
// Hint- HashMap will be used
// TC- O(n) & SC is O(n).  
public Node copyRandomList(Node head) {
        HashMap<Node,Node>h= new HashMap<>();
        Node temp= head; 
        while(temp!=null)  // Isme hum new Node bna rhe h 
        {
            Node copy= new Node(temp.val);
            h.put(temp,copy);
            temp=temp.next;
    
        }
        temp=head;
        while(temp!=null)  //  Isme jo new Node bnaye h unko aaps me connect kr rhe h
        {
            if(temp.next==null)
            {
                 h.get(temp).next=null;
                    temp=temp.next;
            }
            else
            {
            h.get(temp).next=h.get(temp.next);
            temp=temp.next;
            }
        }
        
        temp=head;
    
        while(temp!=null) // yha new Node me random k pointers ko value de rhe h 
        {
            if(temp.random==null)
            {
                h.get(temp).random=null;
                    temp=temp.next;
            }
            else
            {
                h.get(temp).random=h.get(temp.random);
                temp=temp.next;
            }
        }
        
        
        
        return h.get(head);
    }