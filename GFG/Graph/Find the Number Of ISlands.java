// Logic -DFS Legega and ye khd se schna ki kisi Question me BFS legega ya DFS
class Solution
{
    //Function to find the number of islands.
    public int numIslands(char[][] arr)
    {
        int count=0;
    
        boolean is_visit[][]= new boolean[arr.length][arr[0].length];
        
        
    
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                
                if(arr[i][j]=='1' && is_visit[i][j]==false)
                {
                    
                    
                     B(arr,is_visit,i,j);
                     count++;
                }
    
            }
        }
    return count;
    }
     public void B(char arr[][], boolean is_visit[][],int i,int j)
    {

     
        if(i<0  || j<0 || i>=arr.length || j>=arr[0].length )
        {
        
            return;
        }
        
      if(arr[i][j]=='0') return;
        
        if(is_visit[i][j]==false)
        {
            is_visit[i][j]= true;
            
             B(arr,is_visit,i+1,j); //DOWN 
             B(arr,is_visit,i-1,j); //UP
              B(arr,is_visit,i,j+1); //RIGHT
                B(arr,is_visit,i,j-1); // LEFT
                B(arr,is_visit,i+1,j+1); //RIGHT-BOTTOM DIAGONAL
                B(arr,is_visit,i-1,j-1); // LEFT UP DIAGONAL
                 B(arr,is_visit,i+1,j-1); // LEFT BOTTOM DIAGONAL
              B(arr,is_visit,i-1,j+1); //RIGHT UP DIAGONAL
             
              
    }
    }
}