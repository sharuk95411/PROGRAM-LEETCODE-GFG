/* isme hme dependencies de rkhi h jo ki same topological me hta h ab hm un dependncies se graph bna lge agr wo asyclic graph h to ans 1 and agr ni h to 0 return 
like course schedule leetcode ques jsa hi h ya same whi hi h */
class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Integer>>l= new ArrayList<>();
        
        for(int i=0;i<K;i++)
        {
            l.add(new ArrayList<>());
        }
        
        for(int i=0;i<N-1;i++)
        {
            String s1= dict[i];
            String s2= dict[i+1];
            
            int length= Math.min(s1.length(), s2.length());
            
            for(int j=0;j<length;j++)
            {
                 if(s1.charAt(j)!=s2.charAt(j))
               {
                 int c1= s1.charAt(j);
                 int c2= s2.charAt(j);
                 l.get(c1-'a').add(c2-'a');
                    break;
               }
                
            }
            
        }
         int isVisited[]= new int [K];
       int  check[]= new int[K];
         for(int i=0;i<K;i++)
         {
             if(isVisited[i]== 0)
             {
                 if(dfs(l,isVisited,i,check)==true)
                 return "0" ; // mean cycle bn ri h
             }
         }
         return "1"; // Cycle ni form hui
        
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