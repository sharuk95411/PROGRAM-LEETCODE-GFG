import java.util.*;
public class NQueenProblem {
    
  boolean checkAns=false;
  public void queenProblem(int N) {
    int[][] sol = new int[N][N];
     queenProblemUtil(0, sol,N); 
     if(checkAns==false)
     {
         System.out.println("No Solution Possible");
     }
     
    
  }
  
  private boolean queenProblemUtil(int col, int[][] sol,int N) {
    
    if(col >= N) {
        checkAns=true;
        printQueenPlacement(sol,N);
        System.out.println( "");
        
      return true;
    }
    
    for(int row = 0; row < N; row++) {
      
      if(isSafeToPlaceQueen(row, col, sol,N)) {
        sol[row][col] = 1;
        
        if(queenProblemUtil(col + 1, sol,N)) {
          
        }
        
      }
        sol[row][col] = 0;
       
    }
    return true;

  }
  
  private boolean isSafeToPlaceQueen(int row, int col, int[][] sol,int N) {
    int i, j;
    
    for(i = 0; i < col; i++) {
      if(sol[row][i] == 1) {
        return false;
      }
    }
    
    for(i = row, j = col; i >= 0 && j >= 0 ; i--, j--) {
      if(sol[i][j] == 1) {
        return false;
      }
    }
    
    for(i = row, j = col; i < N && j >= 0 ; i++, j--) {
      if(sol[i][j] == 1) {
        return false;
      }
    }
    
    return true;
  }
  
  private void printQueenPlacement(int[][] mat,int N) {
      ArrayList<Integer>l= new ArrayList<>();
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
       System.out.print(mat[i][j] + " ");
      }
      System.out.println("");
    }
     }

  public static void main(String[] args) {
    
    int n = 3;
    NQueenProblem prob = new NQueenProblem();
    prob.queenProblem(n);
  }

}