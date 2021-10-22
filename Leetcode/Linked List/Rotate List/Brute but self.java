// TC O(n) SC O(n) isko khd se kia h mne 
class Solution {
    
      class Pair
    {
        ListNode node;
        int data;
        Pair(ListNode n,int val)
        {
            node =n;
            data=val;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp= head;
        List<Pair>list= new ArrayList<>();
        while(temp!=null)
        {
            list.add(new Pair(temp,temp.val));
            temp=temp.next;
        }    
        int length=list.size();
        k= k%length;
        
         if(k==0) return head;
        
        ListNode a= head;
        int size= list.size()-1;
        while(k>0)
        {
           temp= list.get(size).node;
            temp.next= a;
            a=temp;
            
            size--;
            k--;
    
        }
        list.get(size).node.next=null;
      return a;
    }
}