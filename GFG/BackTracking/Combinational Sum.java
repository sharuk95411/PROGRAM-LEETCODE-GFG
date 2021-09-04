class Solution
{
/ Logic take U forward se dekh lena idea ml jyga but uske logic ko implement krne se TC bht zyda aygi 
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int sum)
    {
 / isme asa case lia h jisme A k andr ki value repeat ho skti h islye arr lia gya h jisme koi b value rerpeat  ni hgi agr value repaet hgi to same ans multiple times
print hga like A k pass 1,1 value h and sum 2 h so first 1 se b 1 1 sum ayga and second 1 se b 1 1 ayga so islye hm arr bna rhe h but leetcode me list me sre element 
unique h ye given h /
        
         Collections.sort(A);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int element : A) { 
            if (!arr.contains(element)) { 
                arr.add(element); 
            } 
        }
        A(arr,sum,temp,0,r);
        return r;
    }
     static void A(ArrayList<Integer> arr,int sum,ArrayList<Integer> temp,int index,ArrayList<ArrayList<Integer>> r)
     {
        if(sum==0){
 r.add(new ArrayList<>(temp));/ yha pr new Arralist me temp dia gya h bcz yha hum temp k sth khl rhe h and jb backtrack krege to temp ka data chnge hga jisse agr
 l2.add(temp) kia hga to l2 me value change ho jygi but new ArrayList krne se ek new object bn jyga and and us address pr tempka data chla jyga chla jyga /
            
            return;
        }
        for(int i=index;i<arr.size();i++){
            if(sum-arr.get(i)>=0){
                temp.add(arr.get(i));
                sum=sum-arr.get(i);
                A(arr,sum,temp,i,r);
                sum=sum+arr.get(i);
                temp.remove(temp.size()-1);
            }
        }
     }
}
