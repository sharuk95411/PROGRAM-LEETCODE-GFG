class Solution {
    public boolean isBipartite(int[][] graph) {
        int arr[]=new int[graph.length];
        Queue<Integer>q= new LinkedList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
               arr[i]=1;
                q.add(i);
            }
            while(q.size()>0)
            {
                
            int curr= q.poll();
            
            for(int node : graph[curr])
            {
                if(arr[node]==0)
                {
                arr[node]= -arr[curr];
                    q.add(node);
                }
                if(arr[node]==arr[curr]) return false;
            }
            
        }
    
        
    }
        return true;
    }
}