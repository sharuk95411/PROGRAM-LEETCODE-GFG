// Awesome Question and the beuty of this question is all operation will do in O(1)
// Logic -codeBix
//TYNT
class LRUCache {

    class Node
    {
        Node prev,next;
        int key,value;
        Node(int k, int v)
        {
            key=k;
            value=v;
        }
    }
Map<Integer,Node>map= new HashMap<>();
    int capacity;
Node head;
Node last;
    public LRUCache(int capacity) {
        this.capacity= capacity;
        head= new Node(0,0);
        last= new Node(0,0);
        head.next=last;
        last.prev= head;
        
    }
    
    public int get(int key) {
        
        Node n= map.get(key);
            if(n==null) return -1;
        
        remove(n);
        insert(n);
        return n.value;
        
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }
        if(map.size()==capacity)
        {
            remove(last.prev);
        }
        insert( new Node(key,value));
    }
    
    public void insert( Node n)
    {
        
		map.put(n.key, n);
        n.next=head.next;
        head.next.prev= n;
        n.prev=head;
       head.next=n;
    }
    public void remove(Node n)
    {
        map.remove(n.key);
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
}