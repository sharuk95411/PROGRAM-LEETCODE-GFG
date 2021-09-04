// Logic take U forward se dekh lena idea ml jyga but uske logic ko implement krne se TC bht zyda aygi 
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
        List<List<Integer>> l2 = new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return l2;
        Arrays.sort(candidates);
        List<Integer> l1 = new ArrayList<>();
       A (l2,l1,candidates,target,0,candidates.length);
        return l2;
    }
     static void A(List<List<Integer>> l2, List<Integer> l1, int[] arr, int target, int strt,int end)
    {
        if(target==0)
        {
            l2.add(new ArrayList<>(l1)); /*yha pr new Arralist me l1 dia gya h bcz yha hum l1 k sth khl rhe h and jb backtrack krege to l1 ka data chnge hga jisse agr 
l2.add(11) kia hga to l2 me value change ho jygi but new ArrayList krne se ek new object bn jyga and and us address pr l1 chla jyga*/
            
            return;
        }
        for(int i=strt; i<end; i++)
        {
         if(target-arr[i]>=0)
         {
             l1.add(arr[i]);
             target=target-arr[i];
            A(l2,l1,arr,target,i,end);
             target=target+arr[i];
            l1.remove(l1.size()-1);
         }
        }
}
}