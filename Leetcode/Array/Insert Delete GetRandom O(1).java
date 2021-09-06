// hint - two data str use hge bcz isko o(1) me jo krna h logic from codebix and isme complexity sikhne ko mil gi h collections ki
class RandomizedSet {
HashMap<Integer,Integer>h;
    List<Integer>l;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        h= new HashMap<>();
      l= new ArrayList<>();  
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(h.containsKey(val)==true) return false;
        else
        {
         l.add(val);
            h.put(val,l.size()-1);
            return true;
        }
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(h.containsKey(val)==false) return false;
        else
        {
            int index= h.get(val);
            int temp= l.size()-1;
             Collections.swap(l, index, temp); // ye sb O(1) krne k liye kia gya h
            int value= l.get(index);
            h.put(value,index); // yha swap krne bd element ki index update kr rhe h 
            l.remove(l.size()-1);
            h.remove(val);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() { // ye getRandom k andr ka code smjh ni aya h.
        Random random = new Random(); 
        int n = random.nextInt(l.size());
        return l.get(n);
        
    }
}
