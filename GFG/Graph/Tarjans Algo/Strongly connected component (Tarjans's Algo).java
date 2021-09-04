import java.util.*;
public class My {
    
   static private int time=0;
    
      public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> adj) 
     {
         ArrayList<ArrayList<Integer>>ans= new  ArrayList<>();
      int disc[]= new int[V];
        int low[]= new int[V];
        boolean present_in_stack[]= new boolean[V];
        Stack<Integer>mystack= new Stack<>();
        Arrays.fill(disc,-1);
        Arrays.fill(low,-1);
        
        for(int i=0;i<V;i++)
        {
            if(disc[i]==-1)
            dfs(i,disc,low,mystack,present_in_stack,adj,ans);
            
        }
        return ans;
         
     }
     
     static void dfs(int u,int disc[],int low[],Stack<Integer>mystack,boolean present_in_stack[],ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>>ans )
     
     {
         
         
         disc[u]= low[u]= time;
         time++;
         mystack.add(u);
         present_in_stack[u]= true;
         
         for(int v:adj.get(u))
         {
             
             if(disc[v]==-1)
             {
                 dfs(v,disc,low,mystack,present_in_stack,adj,ans);
                 low[u]= Math.min(low[u],low[v] );
             }
             else if(present_in_stack[v]==true)
             {
                  System.out.println(v +" and "+u +" Is Backage");
                 low[u]= Math.min(low[u],disc[v]);
             }
         }
         
    int w = -1;
    if (low[u] == disc[u])
    {
       ArrayList<Integer>list= new ArrayList<>();
        while (w != u)
        {
            w = mystack.pop();
            list.add(w);
           // System.out.print(w + " ");
            present_in_stack[w] = false;
        }
        ans.add(list);
       // System.out.println();
    }
     }
    public static void main(String args[]) {
     ArrayList<ArrayList<Integer>>l= new ArrayList<>();
     int v=5;
     for(int i=0;i<v;i++)
     {
         l.add(new ArrayList<Integer>());
     }
     
     l.get(1).add(0);
     l.get(0).add(3);
     l.get(0).add(2);
     l.get(2).add(1);
     l.get(3).add(4);
     My obj= new My();
     ArrayList<ArrayList<Integer>>ans=obj.tarjans(v,l);
     
     for(int i=0;i<ans.size();i++)
     {
         for(int k: ans.get(i))
         {
             System.out.print(k+ " ");
         }
         System.out.println();
     }
     
     
    }
    
}