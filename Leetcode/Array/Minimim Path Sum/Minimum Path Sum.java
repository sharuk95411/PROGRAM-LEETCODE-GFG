class Solution {
    int min_sum= Integer.MAX_VALUE;
    public int minPathSum(int[][] arr) {
      if(arr.length==0) return 0;
        
        A(0,0,arr,0);
        return min_sum;
    }
    private void A(int s1,int s2,int arr[][],int sum)
    {
    if(s1>=arr.length || s2>=arr[0].length) return ; 
                 
        sum=sum+arr[s1][s2];
        if(s1==arr.length-1 && s2== arr[0].length-1)
        {
            if(min_sum>sum) 
            {
                min_sum= sum;
                
                return;
            }
        }
    
        A(s1,s2+1,arr,sum);
        A(s1+1,s2,arr,sum);
    }
}