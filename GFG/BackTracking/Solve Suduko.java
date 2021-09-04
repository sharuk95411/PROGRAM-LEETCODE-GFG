step 1- phle 0 value ki index find kro
step 2- ab us 0 value ki jgh pr 1 se 9 tk ki jo jo possible values ho wo rkho
step 3- 1-9 kai sri values rkhge but usme se  1 hi value acceptable hgi so yha rkhge then backtrack krege.
// yha iski TC kfi zyda hgi bcz each time me ye strt se traverse krta h jb SolveSudoku function call hta h 


class Solution
{
    
    static boolean SolveSudoku(int arr[][])
    {  
           for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] == 0){
                for(int c = 1; c <= 9; c++){
                     if(B(arr, i, j, c)){
                       arr[i][j] = c; 
                            
                        if(SolveSudoku(arr))
                                return true; 
                            else
                     arr[i][j] = 0; // yha backtraking kr rhe h 
                        }
                    }
                     return false;
                }
            }
        }
        return true;
    }
    
   
    static boolean B(int arr[][],int x,int y,int p)
    {
        for(int i=0;i<arr.length;i++) // check the entire row, so row value increase hgi and colum constant rhga
    {
       if(arr[i][y]==p) return false; 
    }
    for(int j=0;j<arr.length;j++)  // check the entire column, so colum value increase hgi and row constant rhga
    {
        if(arr[x][j]==p ) return false;
    }
//its formula to get the starting position of 3*3 submatrix 
    int x3= x/3*3;
    int y3= y/3*3;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(arr[x3+i][y3+j]==p ) return false;
        }
    }
    return true;
    }
    
    static void printGrid (int grid[][])
    {
     for(int i=0;i<grid.length;i++)
     {
         for(int j=0;j<grid.length;j++ )
         {
             System.out.print(grid[i][j]+" ");
         }
        
     }
    }
}