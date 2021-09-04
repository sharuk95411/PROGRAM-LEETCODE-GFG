class Solution 
{
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
    int isVisited[]= new int [V];
       int   check[]= new int[V];
         for(int i=0;i<V;i++)
         {
             if(isVisited[i]== 0)
             {
                 if(dfs(adj,isVisited,i,check)==true)
                 return true;
             }
         }
         return false;
         
    }
 public boolean dfs(ArrayList<ArrayList<Integer>> l,int isVisited[],int i,int check[])
    {
     isVisited[i]=1;
      check[i]= 1;
    for(Integer it: l.get(i))
     {
         if(isVisited[it]==0)
         { 
             if(dfs( l,isVisited,it,check)==true)
             return true;
         }
         else if( check[it]==1 )
         {
            return true;
            
         }
     }
     check[i]= 0;
     return false;
        
    }
}