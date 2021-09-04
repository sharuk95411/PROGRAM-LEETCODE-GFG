class Solution{
    
long pathCount=0;
    
    long numberOfPaths(int m, int n) {
         
         return A(0,m,0,n);
    }
     long A(int row,int m,int column,int n)
    {
        if(row>=m||column>=n)
        {
            return 0;
        }
        
       if(row==m-1&&column==n-1)
        {
         pathCount++;   
        }
        A( row+1, m, column, n);
        A( row, m, column+1, n);
         
        return pathCount;
    }
    
}