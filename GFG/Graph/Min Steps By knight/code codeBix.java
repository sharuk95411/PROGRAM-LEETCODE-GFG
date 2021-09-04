

class Solution
{
    class Coordinate {
    int x, y;
    
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
            int[] dx = {-1, -2, -1, -2, 1, 2, 1, 2};
           int[] dy = {-2, -1, 2, 1, -2, -1, 2, 1};
           boolean[][] isVisited = new boolean[N+1][N+1];
        int x1= KnightPos[0];
        int y1= KnightPos[1];
         
       int x2= TargetPos[0];
        int y2= TargetPos[1];
        
        Queue<Coordinate> queue = new LinkedList<Coordinate>();
        queue.add(new Coordinate(x1, y1));
        isVisited[x1][y1] = true;
        int moveCount = 0;
        
          while (!queue.isEmpty()) {
            int size = queue.size();
            for (int count = 0; count <size; count++) {
                Coordinate currPos = queue.remove();
                if (currPos.x == x2 && currPos.y == y2) {
                    return moveCount;
                }

         for (int i = 0; i < 8; i++) {
 if (isValid(currPos.x + dx[i], currPos.y + dy[i],N) && isVisited[currPos.x + dx[i]][currPos.y + dy[i]] == false) {
            queue.add(new Coordinate(currPos.x + dx[i], currPos.y + dy[i]));
           isVisited[currPos.x + dx[i]][currPos.y + dy[i]] = true;
                    }
                }                
            }
            moveCount++;
        }
        
        return -1;
        
    }
     public boolean isValid(int x, int y, int N) {
        if (x <= 0 || y <= 0 || x > N || y > N) {
            return false;
        }
        
        return true;
     }
}