class Solution
{
   
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        int arr[]= new int[v];
        boolean visited[]= new boolean[v];
        Stack<Integer>s= new Stack<>();
        
        for(int i=0;i<v;i++)
        {
            if(visited[i]==false )
            {
                visited[i]= true;
                A(adj,s,visited,i);
            }
        }
      
        
        int k=0;
        while(s.size()>0)
        {
            arr[k++]= s.pop();
            
        }
        return arr;
        
    }
    static void A(ArrayList<ArrayList<Integer>>list,Stack<Integer>s,boolean visited[], int i)
    {
        
        for(int it :list.get(i))
        {
            if(visited[it]==false )
            {
                visited[it]= true;
                A(list,s,visited,it);
            }
        }
        s.push(i);
    }
}
