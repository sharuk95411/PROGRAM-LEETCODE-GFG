
// logic codebix.
// bht pyra question h must try yourself.
//Recursion me hum probelm ko subprbmlem me devide kr lte h jo ki isme hga isko phle recusion then Memoization then tabulation se krna .
// isme hmne char ko integer me bdlne k liye function b seekha h.
// Isko momoization khd se kia h mne
    public int numDecodings(String s) {
        
        
        return A(s,0);
        
    }
    
    private int A(String s,int index)
    {
        if(index==s.length()) return 1 ;
        
        if(s.charAt(index)=='0') return 0;
    
        if(index==s.length()-1) return 1;
        
        int way1= A(s,index+1);
        int way2=0;
        if((Integer.parseInt(s.substring(index,index+2))<=26))
        {
            way2= A(s,index+2);
        }
        return way1+way2;