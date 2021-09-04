// simple logic h 2 binary serch mthd bnakr leftmost and rightmost element k liye chla do and ye sol 100 acceptance rate ay h iska.
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a[]= new int[2];
        
        a[0]= binary_search(0,nums.length-1,nums,target);
        if(a[0]==-1) return new int[]{-1,-1};
         a[1]= binarysearch(0,nums.length-1,nums,target); 
        
        return a;
       // return new int[]{1,2};
    }
    
    private int binary_search(int left,int right,int arr[],int target)
    {
        while(left<=right)
        {
            int mid = left+ (right-left)/2;
            if(arr[mid]==target)
            {
                if(mid>0 && arr[mid-1]==target)
                {
                    right= mid-1;
                }
                else
                    return mid;
            }
            else if(arr[mid]>target) right= mid-1;
            else left=mid+1;
        }
        return -1;
    }
    private int binarysearch(int left,int right,int arr[],int target)
    {
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(arr[mid]==target)
            {
                if(mid<=arr.length-2 && arr[mid+1]==target)
                {
                    left= mid+1;
                }
                else
                    return  mid;
            }
            if(arr[mid]>target) right= mid-1;
            else left= mid+1;
        }
        return -1;
    }
}