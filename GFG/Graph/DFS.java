 public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> l)
    {
        ArrayList<Integer>ans= new ArrayList<>();
         boolean isVisited[]= new boolean [V];
         for(int i=0;i<V;i++)
         {
             if(isVisited[i]== false)
             {
                 dfs(ans,l,isVisited,i);
             }
         }
         return ans;
    }
    public void dfs(ArrayList<Integer>ans,ArrayList<ArrayList<Integer>> l,boolean isVisited[],int i)
    {
     isVisited[i]=true;
     ans.add(i);
     for(Integer it: l.get(i)) // this is Internal Iterator jisme internal ArrayList ki sari values a jygi 
     {
         if(isVisited[it]==false)
         {
             dfs(ans, l,isVisited,it);
         }
     }
        
    }