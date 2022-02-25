Time O(N), as each number will be flipper at most once.
Space O(N) for recursion.
**Intution:** Since you are given a starting index and you want to reach to the index where value is 0. So don't think much just start with your starting index 
and keep jumping to the index you can jump from the curr index until unless you reach index with value 0.
Now what should be the terminating conditions:

**1.) **if the curr index becomes out of range (i.e., 0>curIndex>=arr.length) then you cant reach any other index now, so no need to go further from there.
2.) If you reached the same index again, that means now you are stuck in a cycle, you will keep coming to and fro to this index so gain don't go further.


    public boolean canReach(int[] arr, int start) {
         if(start<0 || start>=arr.length || arr[start]==-1) return false;
         if(arr[start]==0)return true;
        int val= arr[start];
        arr[start]=-1;  
       
        
        return canReach(arr,start+val) || canReach(arr,start-val);
        
    }