class Solution {
    public boolean canFinish(int N, int[][] pre) {
        ArrayList<ArrayList<Integer>>list= new ArrayList<>();
         for(int i=0;i<N;i++)
         {
               list.add(new ArrayList<>());
         }
        for(int i=0;i<pre.length;i++)
        {
            int arr[]= new int [2];
            int k=0;
             for( int a :pre[i] )
             {
                 arr[k++]= a;
             }
             list.get(arr[1]).add(arr[0]);
        
        }
        
        int isVisited[]= new int [N];
       int  check[]= new int[N];
         for(int i=0;i<N;i++)
         {
             if(isVisited[i]== 0)
             {
                 if(dfs(list,isVisited,i,check)==true)
                 return false ;
             }
         }
         return true;
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