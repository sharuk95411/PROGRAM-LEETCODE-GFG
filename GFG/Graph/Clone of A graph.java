/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node){
        if(node==null) return null;
        Map<Node,Node>map= new HashMap<>();
        Queue<Node>q= new LinkedList<>();
        q.add(node);
        map.put(node ,new Node(node.val,new ArrayList<Node>()));
        
        while(q.size()>0)
        {
            Node h= q.poll();
            
            for(Node neighbor: h.neighbors)// yha neighbor and neighbors both are ArrayList of Node type
            {
            if(map.containsKey(neighbor)==false)
            {
                map.put(neighbor,new Node(neighbor.val,new ArrayList<Node>()));
                q.add(neighbor);
            }
                map.get(h).neighbors.add(map.get(neighbor)); //yha map.get(neighbor) krne pr wo full node a jyga and starting index me add ho jyga bcz yha ArrayList Node type ki h dhyn rkhna na ki Integer type ki
            }
        }
        
        
        return map.get(node);
    }
}