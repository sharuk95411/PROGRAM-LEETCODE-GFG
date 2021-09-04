import java.util.*;
public class My {
    
   static private int time=0;
    
      public void A(int V, ArrayList<ArrayList<Integer>> adj) 
     {
    
      int disc[]= new int[V];
        int low[]= new int[V];
        int parent[]= new int[V];
        
        boolean articulation_point[]= new boolean[V];
    
        Arrays.fill(disc,-1);
        Arrays.fill(low,-1);
        Arrays.fill(parent,-1);
        
        for(int i=0;i<V;i++)
        {
            if(disc[i]==-1)
            dfs(i,disc,low,articulation_point,adj,parent);
            
        }
        
        for(int i=0;i<articulation_point.length;i++)
        {
            if(articulation_point[i]==true)
            {
                System.out.println("Node "+i +" is Articulation Point");
            }
        }
    
         
     }
     
static void dfs(int u,int disc[],int low[],boolean articulation_point[],ArrayList<ArrayList<Integer>> adj, int parent[] )
     
     {
         
         
         disc[u]= low[u]= time;
         time++;
        int children=0;
         
         for(int v:adj.get(u))
         {
             
             if(disc[v]==-1)
             {
                 children += 1;
		     	parent[v] = u;
                 dfs(v,disc,low,articulation_point,adj,parent);
                 low[u]= Math.min(low[u],low[v] );
             }
             if(parent[u]==-1 && children >1)	//Case-1: u is root
				articulation_point[u] = true;
				
			if(parent[u]!=-1 && low[v]>=disc[u])	//Case-2: when u is not root 
			articulation_point[u] = true;
			
			else if(v!=parent[u])	//Ignore child to parent edge
			low[u] = Math.min(low[u],disc[v]);
         }
         
     }
    public static void main(String args[]) {
     ArrayList<ArrayList<Integer>>l= new ArrayList<>();
     int v=4;
     for(int i=0;i<v;i++)
     {
         l.add(new ArrayList<Integer>());
     }
     
      l.get(0).add(1);
       l.get(1).add(0);
        l.get(0).add(2);
         l.get(2).add(0);
       
       
       
     l.get(2).add(3);
      l.get(3).add(2);
     
    
    
     My obj= new My();
     
     obj.A(v,l);
     
     
     
    }
    
}