// Brute force- Isme hum prefiend class ka use kr rhe h 
class FrontMiddleBackQueue {
    LinkedList<Integer>q;

    public FrontMiddleBackQueue() {
        q= new LinkedList<>();
    }
    
    public void pushFront(int val) {
        q.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        q.add( (q.size())/2,  val);
    }
    
    public void pushBack(int val) {
        q.addLast(val);
    }
    
    public int popFront() {
        if(q.isEmpty()) return -1;
        else return q.removeFirst();
    }
    
    public int popMiddle() {
        if(q.isEmpty()) return -1;
        else  return q.remove( (q.size()-1)/2 );
    }
    
    public int popBack() {
        if(q.isEmpty()) return -1;
        else return q.removeLast();
    }
}