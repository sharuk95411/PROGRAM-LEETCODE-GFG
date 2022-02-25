// Isme TLE isliye a rha h bcz each time jab b hme valid gas station milta h hm wha se chck krna start kr dte h and ye mne khd se kia h.
//  TC is O(n2)

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        // if gas[i]<cos[i] thats mean wha se to start kr ni skte h 
    
        
        for(int i=0;i<gas.length;i++)
        {
            if(gas[i]>=cost[i])
            {
                if(check(i,gas,cost))
                {
                    return i;
                }
            }
        }
        return -1;
        
    }
    private boolean check(int start_posn,int gas[],int cost[])
    {
        int fuel= gas[start_posn]-cost[start_posn];
        
        int total_steps= gas.length; //itne steps require hge to keep the whole circle
        int i=start_posn;
        
        while(total_steps>0 )
        {
              if(fuel<0) return false;
              i=(i+1)%gas.length;
            fuel= fuel+gas[i]-cost[i];
            total_steps--;
            
        }
        return true;
        
    }
}