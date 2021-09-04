class Solution {
    public int snakesAndLadders(int[][] board) {
        int n= board.length;
        boolean visited[][]= new boolean[n][n];
        visited[n-1][0]= true;
        
        Queue<Integer>q= new LinkedList<>();
        q.add(1);
        
        int steps=0;
        
        while(q.size()>0 )
        {
            int size=q.size();
          for(int i=0;i<size;i++)
          {
              int x=q.poll();
            if(x==n*n) return steps;
            for(int k=1;k<=6;k++) // yha hum already 1 pr khde hue h so max hum 7 tak ja skte h
            {
                if(k+x>n*n) break; //yha exactly n*n tk pchna h na ki usse age
              
              int position[]= find_cordinates(k+x,n);
              int row=position[0];
              int column= position[1];
              if(visited[row][column]==true) continue;
              else visited[row][column]= true;
              if(board[row][column]==-1) q.add(k+x);
              else q.add(board[row][column]);
            }
          }
            steps++;
        }
        return -1;
        
    }
    
    public int[] find_cordinates(int curr,int n) // yhi bs nai chz h isme value ko decode krna 
    {
        int row =n- (curr-1)/n-1;
        int column= (curr-1)%n;
        if(row%2==n%2)// mtlb agr row and size ya to dno even ho ya to dno odd h tb bcz isme hum zig-zag chl rhe h to col pr effect ayga jisse so uske liye hi ye conition h;
        {
            return new int[]{row,n-1-column};
        }
        else
        {
            return new int[]{row,column};
        }
    }
}