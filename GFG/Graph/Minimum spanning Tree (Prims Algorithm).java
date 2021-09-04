class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        
        int parent[]= new int[V];
        int weight[]= new int[V];
        boolean visited[]= new boolean[V];
        
     for(int i=0;i<V;i++)
     {
         parent[i]=-1;
         weight[i]= Integer.MAX_VALUE;
     }
     
     weight[0]=0;
     for(int i=0;i<V-1;i++)
     {
         int u= get_min(weight,visited);
      
           visited[u]= true;
    
              for(ArrayList<Integer>list : adj.get(u))
              {
                 
                  int v= list.get(0);
                  int w= list.get(1);
                  if(weight[v]>w && visited[v]==false )
                  {
                      weight[v]=w;
                      parent[v]=u;
                  }
              }
              
          }
     int cost=0;
     for(int i=0;i<weight.length;i++)
     {
         cost= cost+weight[i];
     }
     return cost;
    }
    
    static int get_min(int weight[],boolean visited[] )
    {
        
        int min=Integer.MAX_VALUE;
        int min_index=-1;
        for(int i=0;i<weight.length;i++)
        {
           if(min>weight[i] && visited[i]==false)
           {
               min= weight[i];
               min_index=i;
           }
        }
        return min_index;
    }
}
