// TC O(N) and TYN
✔️ Observations from brute force :

We start from a station i, get a refill and check if we are able to reach next stations.
If not, we start again from i+1 and continue until we find that station from which we should
actually start our journey ( as we know it is possible to make a circular route now ).

We could do one optimisation in this:
For eg :
s1 , s2 , s3 , s4 , s5 , s6
_|_ , _|_ , _|_ , _|_ , _|_ , _|_
<- - - - -- -- >

If we are able to reach s3 from say s1 but not able to move to s4 then, we should just check if we are able to make a round trip from s4 . why ?

It is same logic with which we were initially saying
( At any given point in time , the amount of gas
present should be greater or equal than the
cost to travel to the next station. )

 public int canCompleteCircuit(int[] gas, int[] cost) {
     
        // First Check actually me circle possible b h ya ni 
        
        int total_gas= 0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++)
        {
            total_gas= total_gas+gas[i];
            total_cost= total_cost+cost[i];
        }
        if(total_gas-total_cost<0) return -1;
        
        
        // Now ab confirm ho gya h Circle to bnega ab each possible index check kr lge left side se end isme ek an ek to ans hga hi ye to cnfrm h
        
        int start=0;
        int total_fuel=0;
        for(int i=0;i<gas.length;i++)
        {
          total_fuel = total_fuel+gas[i]-cost[i];
            
            if(total_fuel<0) // thats mean ab current and left me jitni index h wo to ans ho ni skti to right me se le lte h then phr whi heck kr dte h total_fuel to zero krke.
            {
                start=i+1;
                total_fuel=0;
            }
        }
        
        return start;
    }