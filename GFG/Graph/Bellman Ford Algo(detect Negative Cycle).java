// Ye question Negative Cycle detect kr rha h using Bellman ford Algorithm.

public int isNegativeWeightCycle(int n, int[][] edges)
    {
      
          int dist[]= new int[n];
          Arrays.fill(dist,10000);
          dist[0]=0;
        
          for(int i=0;i<n-1;i++)
          {
              for(int[] edge:edges)
            {
                int u=edge[0];
                int v=edge[1];
                int wt=edge[2];
            
                if(dist[v]>(dist[u]+wt))
                dist[v]=dist[u]+wt;
            }
          }
          
         for(int[] edge:edges)
            {
                int u=edge[0];
                int v=edge[1];
                int wt=edge[2];
                
                if(dist[v]>(dist[u]+wt))
                return 1; 
            }
        
        return 0;
    }