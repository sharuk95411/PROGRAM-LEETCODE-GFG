
class pair
{
    int x1,y1;
    pair(int x1,int y1)
    {
        this.x1= x1;
        this.y1=y1;
    }
}

class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int x1= KnightPos[0];
        int y1= KnightPos[1];
         
        int t1= TargetPos[0];
        int t2= TargetPos[1];
         
        if(x1==t1 && y1==t2) return 0; 
         
        boolean board[][]= new boolean[N+1][N+1];
        board[x1][y1]= true;
    
        
        Queue<pair>q= new LinkedList<>();
        q.add(new pair(x1,y1));
        
        int steps=0;
       while(q.size()>0)
       {
           int size= q.size();
           
     for(int count=0;count<size;count++)
         {
        
        pair p=q.poll();
           int x= p.x1;
           int y= p.y1;
         
           if(x==t1 && y==t2)
           {
               return steps;
           }
           if( (x-2>0 && y-1>0) && board[x-2][y-1]==false ) //yha isValid function next time bna lena ki wha value check kro isse progrm aur b efficient ho jyga
           {
               q.add(new pair(x-2,y-1));
               board[x-2][y-1]=true;
             
           }
          if( (x-2>0 &&y+1<=N) && board[x-2][y+1]==false  )
          {
              q.add(new pair(x-2,y+1 ));
              board [x-2][y+1]= true;
             
          }
          if( (x-1>0 &&y-2>0) && board[x-1][y-2]==false  )
          {
              q.add(new pair(x-1,y-2 ));
              board[x-1][y-2]= true;
              
          }
          if( (x+1<=N &&y-2>0) && board[x+1][y-2]==false  )
          {
              q.add(new pair(x+1,y-2 ));
              board [x+1][y-2]= true;
              
          }
          if( (x+2<=N &&y+1<=N) && board[x+2][y+1]==false  )
          {
              q.add(new pair(x+2,y+1 ));
              board [x+2][y+1]= true;
              
          }
          if( (x+2<=N &&y-1>0) && board[x+2][y-1]==false  )
          {
              q.add(new pair(x+2,y-1 ));
              board [x+2][y-1]= true;
              
          }
          if( (x-1>0 &&y+2<=N) && board[x-1][y+2]==false  )
          {
              q.add(new pair(x-1,y+2 ));
              board [x-1][y+2]= true;
              
          }
          if( (x+1<=N &&y+2<=N) && board[x+1][y+2]==false  )
          {
              q.add(new pair(x+1,y+2 ));
              board [x+1][y+2]= true;
             
          }
          
           
       }
       steps++; // yha se khai ncreament hga yhi main h bcz ek step me 8 moves chl skte h to wha size of queue 8 hga to us 8 queue jb khli hga tb ek move count hoga 
       }
       return 0;
    }
}
    