class Solution {
     static ArrayList<String>l;
    public static ArrayList<String> findPath(int[][] m, int n) {
       l= new ArrayList<>();
        String s="";
        A("",m,0,0,n-1,s);
        if(l.size()==0)  l.add("-1");
       Collections.sort(l);// yha sort q kia h bcz ans inko sorted alphabetical me chahiye
        return l;
    }
    
    static void A(String str,int arr[][],int i,int j,int n,String s)
    {
        if(i<0 || j<0 || i>n || j>n ||arr[i][j]==0 ) return ;
        
        if(i==n && j==n)
        {
            s=s+str;
            l.add(s);
            s="";
            return;
        }
        arr[i][j]=0;
        s= s+str;
         A("D",arr, i+1, j, n,s);
         A("R",arr, i, j+1, n, s);
         A("U",arr, i-1,j, n, s);
         A("L",arr, i, j-1,n, s);
         arr[i][j] = 1;
         return;
    }
}