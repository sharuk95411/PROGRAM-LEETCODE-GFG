//v jo h wo Node ko bta ri h and w two nodes or vertex se connected weight ko 
import java.util.*;
 class Node
    {
        int w,v;
        Node(int v,int w)
        {
            this.v= v;
            this.w=w;
        }
        Node()
        {}
    }
    
public class MyClass {
    
   
    public void shortestPath(int sourceV,ArrayList<ArrayList<Node>>list,int v)
    {
         PriorityQueue<Node>pq= new PriorityQueue<>(  (Node obj1,Node obj2) -> obj1.w-obj2.w);
        int dis[]= new int[v];
        for(int i=0;i<v;i++)
        {
            dis[i]= 10000;
        }
        dis[sourceV]=0;
        
       
        pq.add(new Node(sourceV,0));
        
        while(pq.size()>0)
        {
            Node  currNode= pq.poll();    
            
            for(Node adjacentNode : list.get( currNode.v))
            {
                // yhe currNode.v jo h wo current Node hi h
               if(dis[ currNode.v ]+ adjacentNode.w <dis[adjacentNode.v] )
               {
                  
                   dis[adjacentNode.v]= dis[ currNode.v]+adjacentNode.w;
                   pq.add(new Node(adjacentNode.v,dis[adjacentNode.v] ));
               }
            }
        }
        
        for(int i=0;i<v;i++)
        {
            System.out.println("Min Distnce from "+sourceV +" to "+(i) + " Node is "+ dis[i]);
        }
        
       // System.out.println(Arrays.toString(dis));
    }
    public static void main(String args[]) {
      int v=5;
      ArrayList<ArrayList<Node>>adj= new ArrayList<>();
      for(int i=0;i<v;i++)
      {
          adj.add(new ArrayList<Node>());
      }
      
    
    	adj.get(0).add(new Node(1, 2));
		adj.get(1).add(new Node(0, 2));
		
		adj.get(1).add(new Node(2, 4));
		adj.get(2).add(new Node(1, 4));
		
		adj.get(0).add(new Node(3, 1));
		adj.get(3).add(new Node(0, 1));
		
		adj.get(3).add(new Node(2, 3));
		adj.get(2).add(new Node(3, 3));
		
		adj.get(1).add(new Node(4, 5));
		adj.get(4).add(new Node(1, 5));
		
		adj.get(2).add(new Node(4, 1));
		adj.get(4).add(new Node(2, 1));
        MyClass obj= new MyClass();
         obj.shortestPath(2,adj,v);
    }
}