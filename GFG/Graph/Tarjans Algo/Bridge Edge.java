import java.util.*;
public class My {
    
    private int time=0;
    
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
            dfs(i,disc,low,adj,parent);
            
        }
        
       
    
         
     }
     
public void dfs(int u,int disc[],int low[],ArrayList<ArrayList<Integer>> adj, int parent[] )
     
     {
         
         
         disc[u]= low[u]= time;
         time++;
         
         for(int v:adj.get(u))
         {
             
             if(disc[v]==-1)
             {
                 
		     	parent[v] = u;
                 dfs(v,disc,low,adj,parent);
                 low[u]= Math.min(low[u],low[v] );
             }
				
			if( low[v]>disc[u])	
	      System.out.println("Edge connected through Node "+u+" and Node "+v+" make a bridge");
          	
			
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
       
       
       
     l.get(1).add(3);
      l.get(3).add(1);
      
          l.get(2).add(1);
           l.get(1).add(2);
    
     My obj= new My();
     
     obj.A(v,l);
     
     
     
    }
    
}