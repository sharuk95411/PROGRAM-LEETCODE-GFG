// iska logic easy h agr ques smjh na aye to kisi vdio se smjh lena and iska 100% Acceptance rate aya tha
class Solution {
    public void gameOfLife(int[][] board) {
        int arr[][]= new int[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                A(i,j,board,arr);
            }
        }
        
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                board[i][j]= arr[i][j];
            }
        }
        
        
    }
    private void A(int i,int j,int board[][],int arr[][])
    {
        int count_live=0,count_dead=0;
        if(i<board.length && j+1<board[0].length)
        {
        if(board[i][j+1]==1) count_live++;
        else count_dead++;
        }
        
         if(i+1<board.length && j+1<board[0].length)
         {
        if(board[i+1][j+1]==1) count_live++;
        else count_dead++;
         }
         if(i+1<board.length && j<board[0].length)
        if(board[i+1][j]==1) count_live++;
        else count_dead++;
        
         if(i+1<board.length && j-1>=0)
        if(board[i+1][j-1]==1) count_live++;
        else count_dead++;
        
         if(i<board.length && j-1>=0)
        if(board[i][j-1]==1) count_live++;
        else count_dead++;
        
         if(i-1>=0 && j-1>=0)
        if(board[i-1][j-1]==1) count_live++;
        else count_dead++;
        
         if(i-1>=0 && j<board[0].length)
        if(board[i-1][j]==1) count_live++;
        else count_dead++;
        
         if(i-1>=0 && j+1<board[0].length)
        if(board[i-1][j+1]==1) count_live++;
        else count_dead++;
        
        if(board[i][j]==0)
        {
            if(count_live==3) arr[i][j]=1;
    
        }
        else
        {
            if(count_live<2) arr[i][j]=0;
            else if(count_live==2 || count_live==3) arr[i][j]=1;
            else if(count_live>3)arr[i][j]=0;
        }
    }
}