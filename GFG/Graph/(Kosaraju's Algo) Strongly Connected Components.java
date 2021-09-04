isme humne jo line comment ki h wo each SCC me present Node ko print kra ri h 
class Solution
{
    private void dfs1(int node, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, boolean vis[]) {
		vis[node] = true;
		for(int it : adj.get(node)) {
			if(vis[it] == false) {
				dfs1(it, st, adj, vis); 
			}
		}

		st.push(node); 
	}

	private void dfs2(int node, ArrayList<ArrayList<Integer>> transpose, boolean vis[]) {
		vis[node] = true;
	//	System.out.print(node +" ");
		
		for(Integer it : transpose.get(node)) {
			if(vis[it] == false) {
				dfs2(it, transpose, vis); 
			}
		}
	}
	  public ArrayList<ArrayList<Integer>> t( int v, ArrayList<ArrayList<Integer>> adj)
     {
        ArrayList<ArrayList<Integer>>list= new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            list.add(new ArrayList<Integer>());
            
        }
        for(int i=0;i<v;i++)
        {
            for(int u : adj.get(i))
            {
                list.get(u).add(i);
            }
            
        }
        return list;
         
     }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int n, ArrayList<ArrayList<Integer>> adj)
    {
        
        boolean vis[] = new boolean[n]; 
        Stack<Integer> st = new Stack<Integer>(); 
        
        for(int i = 0;i<n;i++) {
        	if(vis[i] == false) {
        		dfs1(i, st, adj, vis); 
        	}
        }

        ArrayList<ArrayList<Integer> > transpose =t(n,adj);
		
		
		Arrays.fill(vis,false);
         int count=0;
		while(st.size() > 0) {
			int node = st.pop();
			if(vis[node] == false) {
			 //   System.out.print("SCC : ");
			    count++;
				dfs2(node, transpose, vis);
			//	System.out.println();
			}
		}
		return count;
    }
    
}
