class Solution {
    
    // easy Question h and logic from Naresh Gupta
// TC is O(n3)  but isko O(n2) & O(1) me krna h 
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                if(check(board,board[i][j],i,j))
                { 
                    continue;
                }
                else return false;
                }
            }
        }
        return true;
    
    }
    
    
    private boolean check(char board[][],char c,int row,int col)
    {
        for(int j=0;j<9;j++) // Check the current entire row
        {
            if(board[row][j]==c && j!=col) return false;
        }
        for(int i=0;i<9;i++) // check the current entire column
        {
            if(board[i][col]==c && i!=row) return false;
        }
        // Check the 3*3 subMatrix
    int x3= 3*(row/3);  // bs yhi main chz h isme ki 3*3 ki submatrix me start kha se krna h
    int y3= 3*(col/3);
        
        for(int i=x3;i<x3+3;i++)
        {
            for(int j=y3;j<y3+3;j++)
            {
                if((i!=row && j!=col ) && board[i][j]==c)
                    return false;
            }
        }
        return true;
        
    }
}