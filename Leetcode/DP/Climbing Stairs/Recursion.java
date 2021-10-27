// Logic- Self/
/ Isme basically hme 1 and 2 de rkha h ab hme unki help se all possible way bnane h jinka sum krne pr n aa jye simple 
// so phla trika ye h 1 se start kre
// and second way 2 se start kre and then dno ans ko add kr de simple

class Solution {
    int count =0;
    public int climbStairs(int n) {
              
        count=A(n,0);
        return count;
        
    }
    
    private int A(int n,int sum)
    {
        if(sum==n)
        {
        
            return 1 ;
        }
        if(sum>n) return 0;
    
       count= A(n,sum+1)+A(n,sum+2);
        
        return count;
    
        
    }
}