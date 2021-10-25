 // isko O(1) SC  me krna h and isko krne se hi ye question acha hga O(n) SC me krna to easy h
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int row= mat.length;
        int column= mat[0].length;
        
        if(r*c!= row*column) return mat;
        
    
        
         int[][] res = new int[r][c];
       for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = mat[i/column][i%column];
    return res;
    }