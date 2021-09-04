class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
    List<Integer>l1= new ArrayList<>();
        
        List<List<Integer>>l2= new ArrayList<>();
        A(0,nums,l1,l2);
        return l2;
    }
    private void A(int index,int arr[],List<Integer>l1,List<List<Integer>>l2)
    {
        if(index==arr.length)
        {
            l2.add(new ArrayList<>(l1));
            return ;
        }
        l1.add(arr[index]);
        A(index+1,arr,l1,l2);
        l1.remove(l1.size()-1);
        A(index+1,arr,l1,l2);
    }
}