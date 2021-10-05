// Logic codebix and code self
class Pair
{
    int x,y;
    Pair(int i,int j)
    {
        x=i;
        y=j;
    }
}

class Solution {
    public int orangesRotting(int[][] arr) {
        
        Queue<Pair>q= new LinkedList<>();
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==2) q.add(new Pair(i,j));
        }
    }
        int ans=0;
        boolean check=false;
        
        while(q.size()>0)
        {
            int loop= q.size();
        //    System.out.println(loop);
            
            while(loop>0)
            {
                Pair p= q.poll();
                int i=p.x;
                int j=p.y;
       // Call the function all 4 Direction
                
                if( j+1<arr[0].length &&arr[i][j+1]==1)
                {
            
                     arr[i][j+1]=2;
                     q.add(new Pair(i,j+1));
                    check=true;
                 
                }
                    if(i-1>=0 &&arr[i-1][j]==1 )
                 {
                     arr[i-1][j]=2;
                     q.add(new Pair(i-1,j));
                        check=true;
                 }
                    
                if(j-1>=0 && arr[i][j-1]==1)
                
                 {
                     arr[i][j-1]=2;
                     q.add(new Pair(i,j-1));
                    check=true;
                 }
                        
                if(i+1<arr.length && arr[i+1][j]==1)
                 {
                     arr[i+1][j]=2;
                     q.add(new Pair(i+1,j));
                    check=true;
                 }
                
                
        
                loop--;
                 }
            
            if(check==true)
            {
                    ans++;
                check=false;
            }
            
            }
            for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==1) return -1;
        }
    }
        
        return ans;
}
}
    
