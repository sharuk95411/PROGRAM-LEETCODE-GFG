public static boolean graphColoring(List<Integer>[] G, int[] color, int node, int M) 
    {
        
        if(node==G.length) return true; // thats mean hmne successfully sare nodes ko traverse kr chuke h 
        
        for(int i=1;i<=M;i++)
        {
            if(isSafe(node,G,color,i))
            {
                color[node]=i;
                if(graphColoring(G,color,node+1,M))return true;
                
                else color[node]=0;
                
            }
        }
        return false;
    }
    static boolean isSafe(int node,List<Integer>[] G,int color[],int val)
    {
        for(int i: G[node])
        {
            if(color[i]==val ) return false;
        }
        return true;
    }