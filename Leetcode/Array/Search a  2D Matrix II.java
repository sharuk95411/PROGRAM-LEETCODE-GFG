    // Logic Naresh Gupta TYN and isko O(n or m) me kia gya h and the way if awesome very simple and easy
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0) return false;
        
        int row= matrix.length;
        int col= matrix[0].length;
        int i=0;
        int j= col-1;
        
        while(i<row && j>=0)
        {
            int num= matrix[i][j];
            
            if(num==target) return true;
            else if(num>target) j--;
            else i++;
        }
        return false;
        
    }