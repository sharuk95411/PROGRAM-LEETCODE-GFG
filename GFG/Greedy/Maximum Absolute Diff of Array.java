 // Step1- Isme phle to Mod ki prp lgai h
// Step2- Now isme element ko ase form krna h ki i wle ek pas and j wle ek pas bcz hme end me only i wle
element hi lene h and form krne pr minus(-) ko ignore krte h like , treat krte h.]
// Step3-ab end me min max only i wle element ka niklte h.
//yha j ki value se koi mtlb hi ni h sol me 

public int maxArr(int[] A) {
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        
        for(int i=0;i<A.length;i++)
        {
            max1= Math.max(max1,A[i]+i );
            min1 = Math.min(min1,A[i]+i );
            max2= Math.max(max2,A[i]-i);
            min2= Math.min(min2,A[i]-i);
            
        }
        int ans= Math.max(max1-min1,max2-min2);
        return ans;
    }