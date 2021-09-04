class Solution {
    boolean ans= false;
    public boolean exist(char[][] board, String word) {
     if(board.length==0)return ans;
        else if(word.length()==0) return ans;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    dfs(board,word,i,j,0);
                        if(ans==true) return ans;
                }
            }
        }
        return ans;
    }
    
    private void dfs(char board[][],String word,int i,int j,int index)
    {
        if(index==word.length())
        {
            ans= true;
            return ;
        }
    if(i<0 || j<0|| i>=board.length|| j>=board[0].length || board[i][j]!=word.charAt(index)) return;
        
        char temp = board[i][j];
        board[i][j]= '*';// yha boolean array ki jgh is trike ko use kia gya h jisse hmra extra space save ho rha h 
        dfs(board,word,i,j+1,index+1);
        dfs(board,word,i+1,j,index+1);
        dfs(board,word,i,j-1,index+1);
        dfs(board,word,i-1,j,index+1);
        board[i][j]= temp; // Backtraking
        return ;
    }
}