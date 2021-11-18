   /* Logic- Naresh Gupta TYN its easy question isme loop ko kse chalana h and kitne loop chlane h yhi krna h bs 
TC is O(n2)*/   
 public int[][] generateMatrix(int n) {
        
        int arr[][]= new int[n][n];
        int count=1;
        int top=0,left=0,right=n-1,bottom=n-1;
        
        while(count<=n*n)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]= count++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]= count++;
            }
            right--;
            
            for(int i=right;i>=left;i--)
            {
                arr[bottom][i]= count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                arr[i][left]= count++;
            }
            left++;
        }
        return arr;
    }