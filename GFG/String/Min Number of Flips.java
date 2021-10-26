// Logic - Isme Two case liye gye h (1) Jb string 0 se start ho tb 0 even and 1 odd pr ho to hme flip ni krna pdega and
(2) jab String 1 se start ho tb even pr 1 and odd pr 0 ho tb koi flip ni krna pdega other case me flip krna pdega yhi logic lgaya h    
 public int minFlips(String S) {
        char c[]= S.toCharArray();
        int count1=0,count2=0;

        for(int i=0;i<c.length;i++)   // Jb String 1 se start ho
        {
            if(i%2==0)// even case
            {
                if(c[i]!='1') count1++;
            }
            else
            {
                if(c[i]!='0') count1++;
                
            }
            
        }
        for(int i=0;i<c.length;i++) // Jab String 0 se start ho 
        {
            if(i%2==0)// even case
            {
                if(c[i]!='0') count2++;
            }
            else
            {
                if(c[i]!='1') count2++;
                
            }
            
        }
        return Math.min(count1,count2);
    }
