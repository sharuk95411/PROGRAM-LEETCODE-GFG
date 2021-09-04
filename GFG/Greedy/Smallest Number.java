 static String smallestNumber(int S, int D){
        String ans="";
        if(9*D<S) return "-1";
        for(int i=D-1;i>=0;i--)
        {
            if(S>9)
            {
                ans= "9"+ans;
                S=S-9;
            }
            else
            {
                if(i==0) ans= Integer.toString(S)+ans;
                else
                {
                ans= Integer.toString(S-1)+ans;
                i--;
                while(i>0)
                {
                    ans= "0"+ans;
                    i--;
                }
                ans="1"+ans;
                break;
                }
            }
        }
        return ans;
    }