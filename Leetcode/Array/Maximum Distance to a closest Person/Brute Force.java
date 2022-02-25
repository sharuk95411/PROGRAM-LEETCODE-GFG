// isko khd se kia h TC O(n2) isme har jgh pr beth kr left and right check kia h bar bar  
public int maxDistToClosest(int[] seats) {

         if(seats.length==2) return 1; 
             
        int max_distance= Integer.MIN_VALUE;
        
        int steps=0;
        int l=0,r=0;
        
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]==0)
            {
                //Find min distance from left side person
                int left=i;
                
                while(left>=0 && seats[left]==0)
                {
                    l++;
                    left--;
                }
                
                int right=i;
                while(right<seats.length && seats[right]==0)
                {
                    right++;
                    r++;
                }
                
                if(i==0)
                {
                          max_distance= Math.max(max_distance,Math.max(l,r));
                }
                else if ( i==seats.length-1)
                {
                          max_distance= Math.max(max_distance,Math.max(l,r));
                }
                else
                max_distance= Math.max(max_distance,Math.min(l,r));
                
                l=0;
                r=0;
            }
        }
        return max_distance;
    }