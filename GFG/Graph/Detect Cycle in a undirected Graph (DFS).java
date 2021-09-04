class Solution
{
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>>l)
    {
       boolean vis[]= new boolean[V];
    
       for(int i=0;i<V;i++)
       {
           if(vis[i]==false)
           {
               if (dfs(i,-1,vis,l))
               return true;
               
           }
       }
       return false;
    }
  public boolean  dfs(int curr,int parent, boolean vis[],ArrayList<ArrayList<Integer>>l)
    {
        vis[curr]=true;
        
        for(Integer it: l.get(curr))
        {
            if(vis[it]==false)
            {
               if( dfs(it,curr,vis ,l))
                return true;
            }
            else if(it!=parent) return true;

        }
        return false;
        
    }
}