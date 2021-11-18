// Logic self
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         int area=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
              // System.out.println(i+" "+j);
                    int tempArea= A(grid,i,j);
              // System.out.println(tempArea);
                    
                    area= Math.max(area,tempArea);
                }
            }
        }
        return area;
    }
    
    private int A(int arr[][],int i,int j)
    {
        if(i<0 || j<0||i>=arr.length||j>=arr[0].length ) return 0;
        if(arr[i][j]==0) return 0;
        else
        {
            arr[i][j]=0;
           int area=  1+A(arr,i,j+1)+A(arr,i,j-1)+A(arr,i+1,j)+A(arr,i-1,j);
            return area;
        }
    }
}