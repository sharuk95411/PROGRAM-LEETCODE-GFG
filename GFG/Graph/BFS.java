TC is (V+E) not V*E you can check by dry run the program and SC is (V)
 public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
       ArrayList<Integer>ans= new ArrayList<>();
        boolean check[]= new boolean[V];
        Queue<Integer>q= new LinkedList<>();
        q.add(0);
        check[0]= true;
        while(q.size()>0)
        {
            int n= q.poll();
            ans.add(n);
            ArrayList<Integer>l= adj.get(n);
            for(int i=0;i<l.size();i++)
            {
                int a= l.get(i);
                if(check[a]==false)
                {
                    q.add(a);
                    check[a]=true;
                }
            }
            
        }
        return ans;
    }