class Solution {
    public int makeConnected(int n, int[][] connections) {
        int v= n;
        int edges= connections.length;
        if(v-1>edges) return -1;
        
        int count=0;
        ArrayList<ArrayList<Integer>>list= new ArrayList<>();
        for(int j=0 ;j<v;j++)
        {
            list.add(new ArrayList<>());
        }
        for(int arr[]: connections) // yha hmne nai chz kri h isko dsre type se b kr skte the but isse new way pta chlte h
        {
            
            list.get(arr[0]).add(arr[1]);
            list.get(arr[1]).add(arr[0]);
        }
        boolean vis[]= new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(vis[i]==false)
            {
                DFS(vis,i,list);
                count++;
            }
        }
        return count-1;
    }
    public void DFS(boolean vis[],int i,ArrayList<ArrayList<Integer>>list)
    {
        vis[i]=true;
        for(Integer it: list.get(i))
        {
            if(vis[it]==false)
            {
                DFS(vis,it,list);
            }
        }
    }
}