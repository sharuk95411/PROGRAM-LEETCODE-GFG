 static int countSquares(int N) {
         if(N<=1) return 0;
        int ans=1;
        int count=1;
        int i=2;
        while(i<N)
        {
            ans=i;
            ans= ans*ans;
            if(ans<N)
            {
                count++;
                i++;
            }
            else break;
        }
        return count;
        
    }