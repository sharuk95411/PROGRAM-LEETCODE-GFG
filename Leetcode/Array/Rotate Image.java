 // Isko O(1) Space me krna h 
    // Step 1- swap the horizonatal wise of row
    // Step 2- Traverse the matrix
    public void rotate(int[][] matrix) {
 if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int n = matrix.length;

        // Rotate the original matrix on horizontal axis. (swap rows)
        // yha hum row ko utha rhe h and puri row ko swal kr rhe h and isme jo kia gya h usse hme reference mil rhe h to ye new chz seekhi h single loop me swap krna.
        for (int i = 0; i < n / 2; i++) {
            int[] tempRow = matrix[i]; // Only reference will be saved
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tempRow;
        }
        
        
        
        // Transpose the rotated matrix
        // Yha diagonal wise traverse kr rhe h  and next time ye loop khd se bnane ko try krna 
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        